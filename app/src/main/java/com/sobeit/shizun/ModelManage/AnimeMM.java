package com.sobeit.shizun.ModelManage;

import com.sobeit.shizun.models.Anime;
import com.sobeit.shizun.models.GenericMM;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created on 02/junio/18.
 * Created by Ullysses
 *
 * @author Ulises Tuz Interian
 * @email ullydetei@gmail.com
 */

public class AnimeMM extends GenericMM<Anime> {

    public AnimeMM(){}

    public static AnimeMM intance = new AnimeMM();

}

//    Query's
//    public List<Comment> findByBudgetID(Long id) {
//        return Comment.find(Comment.class, "budget = ?", id.toString());
//    }
//
//    public ConfigWedding findUnique() {
//        final List<ConfigWedding> configWeddings = ConfigWedding.listAll(ConfigWedding.class);
//        if(configWeddings.size()> 0){
//            return configWeddings.get(0);
//        }
//        return new ConfigWedding();
//    }
//
//    public List<EventWedding> findByDate(Date date){
//        List<EventWedding> resultRaw =  EventWedding.listAll(EventWedding.class);
//        List<EventWedding> result =  new ArrayList<>();
//        for(EventWedding ev : resultRaw){
//            if(DateHelper.isSameDay(ev.getDate(),date)){
//                result.add(ev);
//            }
//        }
//        return result;
//    }
//
//    public LikeCommentVendor findByID(Long id){
//        final List<LikeCommentVendor> likeCommentVendors = LikeCommentVendor.find(LikeCommentVendor.class,"id_like = ?", id.toString());
//        if(likeCommentVendors.size() > 0)
//            return likeCommentVendors.get(0);
//        //return LikeCommentVendor.find(LikeCommentVendor.class,"id_like = ?", id.toString());
//        return null;
//    }

