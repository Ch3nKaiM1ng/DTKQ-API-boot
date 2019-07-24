package com.dtkq.api.service.impl;

import com.dtkq.api.entity.ClassObj;
import com.dtkq.api.entity.TalkClass;
import com.dtkq.api.mapper.ClassObjMapper;
import com.dtkq.api.mapper.TalkClassMapper;
import com.dtkq.api.service.TalkClassService;
import com.dtkq.api.service.TalkClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalkClassServiceImpl implements TalkClassService {

    @Autowired(required = false)
    private TalkClassMapper mapper;
    @Override
    public List<TalkClass> selectAll(TalkClass obj) {
        return mapper.selectAll(obj);
    }

    public List<TalkClass> findWebList(TalkClass obj) {
        List<TalkClass> firstList= mapper.findSonList(obj);
        if(firstList.size()>0){
            findGrandSonList(firstList,obj);
        }
        return firstList;
    }

    @Override
    public TalkClass selectObj(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertObj(TalkClass obj) {
        mapper.insert(obj);
    }


    @Override
    public void updateObj(TalkClass obj) {
        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delectById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
    private List<TalkClass> findGrandSonList(List<TalkClass> list,TalkClass talkClass){
        if(talkClass.getLevel().equals("1")){
            //创建一个二级分类实体类
            TalkClass sonObj=new TalkClass();
            //根据第一分类的第一条数据查询二级分类数组
            for(int i=0;i<list.size();i++){
                sonObj.setParentId(list.get(i).getId());
                //查找出来所有二级分类
                List<TalkClass> sonList = mapper.findSonList(sonObj);
                //创建一个三级分类实体类
                putList(sonList);
                //将二级分类数组放进一级分类数组中的第一条
                list.get(i).setSonList(sonList);
            }



        }
        return list;
    }
    private List<TalkClass> putList(List<TalkClass> list){
        TalkClass grandSonObj=new TalkClass();
        //根据第二分类的第一条数据查询三级分类数组
        for(int i=0;i<list.size();i++){
            grandSonObj.setParentId(list.get(i).getId());
            //查找出来所有三级分类
            List<TalkClass> grandSonList = mapper.findSonList(grandSonObj);
            //将三级分类数组放进二级分类数组中的第一条
            list.get(i).setSonList(grandSonList);
        }
        return list;


        /*putObj(grandSonList);*/

    }
    /*public List<TalkClass> putObj(List<TalkClass> list){
        ClassObj obj=new ClassObj();
        obj.setLinkClassId(list.get(0).getId());

        List<ClassObj> classList=objMapper.selectByKey(obj);
        list.get(0).setClassObjList(classList);
        return list;
    }*/
}
