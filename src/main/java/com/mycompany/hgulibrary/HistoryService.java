/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 *
 * @author shinhookim
 */
public class HistoryService {
    private static HistoryService single_instance = null;
    HistoryService(){
        historyList = new ArrayList<History>();
    }
    public static synchronized HistoryService getInstance()
    {
        if (single_instance == null)
            single_instance = new HistoryService();
  
        return single_instance;
    }

    private final Collection<History> historyList;

    public void addNewHistory(History newHistory) {
        historyList.add(newHistory);
    }

    public History getHistoryByHistoryId(String historyId) {
        for (History history : historyList) {
            if (history.getHistoryId().equals(historyId)) {
                return history;
            }
        }
        return null;
    }
    
    public Stream<History> getHistoriesByUserId(String userId) {
        return historyList.stream().filter(p -> p.getUserId().equals(userId));
    }
}
