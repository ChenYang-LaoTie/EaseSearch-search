package com.search.EaseSearchsearch.service;

import com.search.EaseSearchsearch.vo.SearchCondition;
import com.search.EaseSearchsearch.vo.SearchTags;

import java.io.IOException;
import java.util.Map;

public interface SearchService {

    Map<String, Object> getSuggestion(String keyword, String lang) throws IOException;

    /**
     * 根据条件搜索
     *
     * @param condition 搜索条件
     * @return 符合条件记录
     * @throws IOException
     */
    Map<String, Object> searchByCondition(SearchCondition condition) throws IOException;


    Map<String, Object> getCount(SearchCondition condition) throws IOException;

    Map<String, Object> advancedSearch(Map<String, String> search) throws Exception;

    Map<String, Object> getTags(SearchTags searchTags) throws Exception;
}
