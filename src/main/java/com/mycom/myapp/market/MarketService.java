package com.mycom.myapp.market;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MarketService {

    public int insertMarket(MarketVO vo);
    public int deleteMarket(int seq);
    public int updateMarket(MarketVO vo);
    public MarketVO getMarket(int seq);
    public List<MarketVO> getMarketList();

}
