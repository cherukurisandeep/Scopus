package com.sb.scopus.dao;

import com.sb.scopus.model.Award;

import java.util.List;

public interface AwardDao {

    public void addAward(Award award);

    public List<Award> getAllAwards();

    public void deleteAward(Integer awardId);

    public Award getAward(Integer awardId);

    public Award updateAward(Award award);

    public List<Award> getAwardsWithOutAuthorId( Integer authorId);
}
