package com.example.Banner.Service;

import com.example.Banner.Entity.*;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class BizBannerService {
    private static final String COL_NAME = "BizBanner";
    public String addBizBanner(BizBannerLocation bizBanner) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(bizBanner.getId()).set(bizBanner);
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

    public String deleteBizBanner(String id) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = dbFirestore.collection(COL_NAME).document(id).delete();
        return "Successfully deleted";
    }

//    public BizBannerLocation fetchNearestBizBannerLocation(Long latitude, Long longitude) throws ExecutionException, InterruptedException {
//        Firestore dbFirestore = FirestoreClient.getFirestore();
//        Query future = dbFirestore.collection(COL_NAME);
//        ApiFuture<QuerySnapshot> querySnapshotApiFuture = future.get();
//        List<QueryDocumentSnapshot> documents = querySnapshotApiFuture.get().getDocuments();
//        List<BizBannerLocation> bizBannerLocations = getBizBannerLocations(documents);
//        BizBannerLocation nearest = bizBannerLocations.get(0);
//        long orginalDiff =  nearest.getLatLng().getValue().get_latitude() - latitude ;
//
//        for (BizBannerLocation bizBannerLocation : bizBannerLocations){
//
//            if (bizBannerLocation.getLatLng().getValue().get_latitude().equals(latitude)){
//                nearest = bizBannerLocation;
//                break;
//            }else{
//                long latDiff = bizBannerLocation.getLatLng().getValue().get_latitude() - latitude;
//
//
//                if (latDiff<orginalDiff){
//
//                    System.out.println("original : "+orginalDiff+" latdiff : "+latDiff);
//                    nearest = bizBannerLocation;
//                    orginalDiff = latDiff;
//                    System.out.println("after original : "+orginalDiff+" latdiff : "+latDiff);
//
//
//                }
//            }
//        }
//        return nearest;
//
//    }
//
//    private List<BizBannerLocation> getBizBannerLocations(List<QueryDocumentSnapshot> documents) {
//        List<BizBannerLocation> bizBannerLocations = new ArrayList<>();
//        for (QueryDocumentSnapshot document : documents){
//            if (document.exists()){
//                bizBannerLocations.add(document.toObject(BizBannerLocation.class));
//            }
//        }
//        return bizBannerLocations;
//    }

}

//    DatabaseReference ref = FirebaseDatabase.getInstance().getReference("https://bizbanner-2fdde-default-rtdb.firebaseio.com");
//        GeoFire geoFire = new GeoFire(ref);
//        // creates a new query around [37.7832, -122.4056] with a radius of 0.6 kilometers
//        GeoQuery geoQuery = geoFire.queryAtLocation(new GeoLocation(37.7832, -122.4056), 0.6);
