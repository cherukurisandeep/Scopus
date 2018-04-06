package com.sb.scopus.service;

import com.sb.scopus.model.Award;

import java.util.List;

public interface AwardService {

    public void addAward(Award award);

    public List<Award> getAllAwards();

    public void deleteAward(Integer awardId);

    public Award getAward(Integer awardId);

    public Award updateAward(Award award);

    public List<Award> getAwardsWithOutAuthorId( Integer authorId);
}
