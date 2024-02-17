package com.example.reviewmsa.review.impl;


import com.example.reviewmsa.review.Review;
import com.example.reviewmsa.review.ReviewRepository;
import com.example.reviewmsa.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> findAll(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }

    @Override
    public boolean addReview(Long companyId, Review review) {

        if(companyId != null && review != null){
            review.setCompanyId(companyId);
            reviewRepository.save(review);
            return true;
        }
        return false;
    }

    @Override
    public Review getReview(Long reviewId){
        return reviewRepository.findById(reviewId).orElse(null);
    }

    @Override
    public boolean updateReview(Long reviewId, Review review) {
        Review ureview = reviewRepository.findById(reviewId).orElse(null);
        if(ureview!=null){
            ureview.setTitle(review.getTitle());
            ureview.setDescription(review.getDescription());
            ureview.setCompanyId(review.getCompanyId());
            ureview.setCompanyId(review.getCompanyId());
            reviewRepository.save(review);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteReview(Long reviewId) {
        Review review = reviewRepository.findById(reviewId).orElse(null);
        if (review!=null) {
            reviewRepository.delete(review);
            return true;
        }
        return false;
    }

}
