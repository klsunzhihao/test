package com.assets.dao.mapper;

import com.assets.dao.entity.TBillPhone;

public interface TBillPhoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_phone
     *
     * @mbg.generated Thu Oct 28 17:12:38 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_phone
     *
     * @mbg.generated Thu Oct 28 17:12:38 CST 2021
     */
    int insert(TBillPhone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_phone
     *
     * @mbg.generated Thu Oct 28 17:12:38 CST 2021
     */
    int insertSelective(TBillPhone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_phone
     *
     * @mbg.generated Thu Oct 28 17:12:38 CST 2021
     */
    TBillPhone selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_phone
     *
     * @mbg.generated Thu Oct 28 17:12:38 CST 2021
     */
    int updateByPrimaryKeySelective(TBillPhone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill_phone
     *
     * @mbg.generated Thu Oct 28 17:12:38 CST 2021
     */
    int updateByPrimaryKey(TBillPhone record);
}