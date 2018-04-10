package com.sb.scopus.service;

import com.sb.scopus.dao.AwardDao;
import com.sb.scopus.model.Award;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AwardSeriveImpl implements AwardService {

    @Autowired
    private AwardDao awardDao;

    @Override
    @Transactional
    public void addAward(Award award) {
        awardDao.addAward(award);
    }

    @Override
    @Transactional
    public List<Award> getAllAwards() {
        return awardDao.getAllAwards();
    }

    @Override
    public void deleteAward(Integer awardId) {
        awardDao.deleteAward(awardId);
    }

    @Override
    public Award getAward(Integer awardId) {
        return awardDao.getAward(awardId);
    }

    @Override
    public Award updateAward(Award award) {
        return awardDao.updateAward(award);
    }

    @Override
    public List<Award> getAwardsWithOutAuthorId(Integer authorId) {
        return awardDao.getAwardsWithOutAuthorId(authorId);
    }
}
