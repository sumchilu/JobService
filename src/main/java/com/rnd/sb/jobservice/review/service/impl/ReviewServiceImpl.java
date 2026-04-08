package com.rnd.sb.jobservice.review.service.impl;

import com.rnd.sb.jobservice.company.model.Company;
import com.rnd.sb.jobservice.company.service.CompanyService;
import com.rnd.sb.jobservice.review.model.Review;
import com.rnd.sb.jobservice.review.repository.ReviewRepository;
import com.rnd.sb.jobservice.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    CompanyService companyService;
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReviews(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }

    @Override
    public boolean addReview(Long companyId, Review review) {
        Company company = companyService.getCompanyById(companyId);
        if(company != null) {
            review.setCompany(company);
            reviewRepository.save(review);
            return true;
        }
        return false;
    }

    @Override
    public Review getReviewById(Long companyId, Long reviewId) {
        List<Review> reviews = reviewRepository.findByCompanyId(companyId);

        return reviews.stream()
                .filter(review -> review.getId().equals(reviewId))
                .findFirst()
                .orElse(null) ;
    }

    @Override
    public boolean updateReview(Long companyId, Long reviewId, Review review) {

        Company companyById = companyService.getCompanyById(companyId);
        if(companyById != null ) {
            review.setCompany(companyById);
            review.setId(reviewId);
            reviewRepository.save(review);
            return true;
        }
        return false;
    }
}
