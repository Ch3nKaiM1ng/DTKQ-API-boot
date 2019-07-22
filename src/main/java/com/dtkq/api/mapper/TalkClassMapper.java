package com.dtkq.api.mapper;

import com.dtkq.api.entity.TalkClass;
import java.util.List;

public interface TalkClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_class
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_class
     *
     * @mbg.generated
     */
    int insert(TalkClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_class
     *
     * @mbg.generated
     */
    TalkClass selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_class
     *
     * @mbg.generated
     */
    List<TalkClass> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_class
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TalkClass record);
}