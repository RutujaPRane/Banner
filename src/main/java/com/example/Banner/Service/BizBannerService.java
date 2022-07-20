package com.example.Banner.Service;

import com.example.Banner.Entity.BizBannerInfo;
import com.example.Banner.Entity.BizBannerLocation;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

@Service
public class BizBannerService {
    private static final String COL_NAME = "BizBanner";


    public String addBizBanner(BizBannerLocation bizBanner) throws ExecutionException, InterruptedException {
        UUID uuid = UUID.randomUUID();
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(String.valueOf(uuid)).set(bizBanner);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public List<BizBannerLocation> getAllBizBanner() throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<QuerySnapshot> future = dbFirestore.collection(COL_NAME).get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        List<BizBannerLocation> bizBannerLocations = new ArrayList<>();
        for (QueryDocumentSnapshot document : documents){
            bizBannerLocations.add(document.toObject(BizBannerLocation.class));
        }
        return bizBannerLocations;
    }

    public BizBannerLocation fetchBizBanner(String uuid) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COL_NAME).document(uuid);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();
        BizBannerLocation bizBannerLocation;
        if (document.exists()){
            return document.toObject(BizBannerLocation.class);
        }
        return null;
    }

    public String updateBizBanner(BizBannerLocation bizBannerLocation) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(bizBannerLocation.getId()).set(bizBannerLocation);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public String deleteBizBanner(String uuid) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = dbFirestore.collection(COL_NAME).document(uuid).delete();
        return "Successfully deleted";
    }
}
