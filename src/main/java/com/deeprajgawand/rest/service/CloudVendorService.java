package com.deeprajgawand.rest.service;

import com.deeprajgawand.rest.model.CloudVendor;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendor();
}
