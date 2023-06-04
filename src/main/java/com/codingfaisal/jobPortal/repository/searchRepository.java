package com.codingfaisal.jobPortal.repository;

import com.codingfaisal.jobPortal.model.jobProfile;

import java.util.List;

public interface searchRepository {
    List<jobProfile> findByText(String text);
}
