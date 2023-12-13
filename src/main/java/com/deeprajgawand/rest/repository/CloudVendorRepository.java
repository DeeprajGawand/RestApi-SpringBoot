package com.deeprajgawand.rest.repository;

import com.deeprajgawand.rest.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

    //there is no need to test the inbuild(present inside jpa) method like findAll findById and save etc

    // this is custom method where we need to do testing
    List<CloudVendor> findByVendorName(String vendorName);
}
