package com.example.Banner.controller;

import com.example.Banner.Entity.BizBannerLocation;
import com.example.Banner.Service.BizBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class BizBannerController {

    @Autowired
    private BizBannerService bannerService;

    @PostMapping("/bizbanner")
    public String addBizBanner(@RequestBody BizBannerLocation bizBanner) throws ExecutionException, InterruptedException {
        return bannerService.addBizBanner(bizBanner);
    }

    @GetMapping("/bizbanner")
    public List<BizBannerLocation> getAllBizBanner() throws ExecutionException, InterruptedException {
        return bannerService.getAllBizBanner();
    }

    @GetMapping("/bizbanner/{uuid}")
    public BizBannerLocation fetchBizBanner(@PathVariable("uuid") String uuid) throws ExecutionException, InterruptedException {
        return bannerService.fetchBizBanner(uuid);
    }

    @PutMapping("/bizbanner")
    public String updateBizBanner(@RequestBody BizBannerLocation bizBannerLocation) throws ExecutionException, InterruptedException {
        return bannerService.updateBizBanner(bizBannerLocation);
    }

    @DeleteMapping("/bizbanner")
    public String deleteBizBanner(@RequestParam String uuid) {
        return bannerService.deleteBizBanner(uuid);

    }
}
