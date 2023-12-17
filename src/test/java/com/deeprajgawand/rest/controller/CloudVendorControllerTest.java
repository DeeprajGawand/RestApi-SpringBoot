package com.deeprajgawand.rest.controller;

import com.deeprajgawand.rest.model.CloudVendor;
import com.deeprajgawand.rest.service.CloudVendorService;
import org.hibernate.mapping.Array;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;




@WebMvcTest(CloudVendorController.class)
class CloudVendorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CloudVendorService cloudVendorService;
    CloudVendor cloudVendorOne;
    CloudVendor cloudVendorTwo;
    List<CloudVendor> cloudVendorList = new ArrayList<>();


    @BeforeEach
    void setUp() {
        cloudVendorOne = new CloudVendor("1", "Amazon",
                "USA","xxxxx");
        cloudVendorTwo = new CloudVendor("2", "GCP",
                "UK","yyyyy");
        cloudVendorList.add(cloudVendorOne);
        cloudVendorList.add(cloudVendorTwo);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetCloudVendorDetails() throws Exception {
        when(cloudVendorService.getCloudVendor("1"))
                .thenReturn(cloudVendorOne);
        this.mockMvc.perform(get("/cloudvendor/1"))
                .andDo(print()).andExpect(status().isOk());

    }

    @Test
    void testGetAllCloudVendorDetail() throws Exception{
        when(cloudVendorService.getAllCloudVendor())
                .thenReturn(cloudVendorList);
        this.mockMvc.perform(get("/cloudvendor/"))
                .andDo(print()).andExpect(status().isOk());

    }

    @Test
    void testCreateCloudVendorDetails() throws Exception {
//        when(cloudVendorService.createCloudVendor(cloudVendorOne))
//                .thenReturn("Success");
//        this.mockMvc.perform(post("/cloudvendor")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(requestJson))
//                .andDo(print()).andExpect(status().isOk());

    }

    @Test
    void updateCloudVendorDetails() {
    }

    @Test
    void deleteCloudVendorDetail() {
    }
}