package com.deeprajgawand.rest.controller;

import com.deeprajgawand.rest.model.CloudVendor;
import com.deeprajgawand.rest.response.ResponseHandler;
import com.deeprajgawand.rest.service.CloudVendorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
@AllArgsConstructor
public class CloudVendorController {

   CloudVendorService cloudVendorService;

    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
      return   ResponseHandler.responseBuilder("Requested Vendor Details are given here",
              HttpStatus.OK,cloudVendorService.getCloudVendor(vendorId));

    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetail(){
        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "success";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "cloud vendor detail updated";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetail(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Sucessfully";
    }
}
