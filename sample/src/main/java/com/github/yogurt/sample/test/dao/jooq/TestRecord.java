/*
 * This file is generated by jOOQ.
 */
package com.github.yogurt.sample.test.dao.jooq;


import com.github.yogurt.sample.test.enums.TypeEnum;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 测试表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRecord extends UpdatableRecordImpl<TestRecord> implements Record9<Long, String, TypeEnum, LocalDateTime, Long, LocalDateTime, Long, LocalDateTime, Boolean> {

    private static final long serialVersionUID = -1039383264;

    /**
     * Setter for <code>test.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>test.name</code>. 姓名
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.type</code>. 类型(N:否,Y:是)
     */
    public void setType(TypeEnum value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.type</code>. 类型(N:否,Y:是)
     */
    public TypeEnum getType() {
        return (TypeEnum) get(2);
    }

    /**
     * Setter for <code>test.time</code>. 日期
     */
    public void setTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.time</code>. 日期
     */
    public LocalDateTime getTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>test.creator_id</code>. 创建人ID
     */
    public void setCreatorId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.creator_id</code>. 创建人ID
     */
    public Long getCreatorId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>test.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>test.gmt_create</code>. 创建时间
     */
    public LocalDateTime getGmtCreate() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>test.modifier_id</code>. 修改人ID
     */
    public void setModifierId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>test.modifier_id</code>. 修改人ID
     */
    public Long getModifierId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>test.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>test.gmt_modified</code>. 修改时间
     */
    public LocalDateTime getGmtModified() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>test.is_deleted</code>. 逻辑删除标识
     */
    public void setIsDeleted(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>test.is_deleted</code>. 逻辑删除标识
     */
    public Boolean getIsDeleted() {
        return (Boolean) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, TypeEnum, LocalDateTime, Long, LocalDateTime, Long, LocalDateTime, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, TypeEnum, LocalDateTime, Long, LocalDateTime, Long, LocalDateTime, Boolean> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Test.TEST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Test.TEST.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TypeEnum> field3() {
        return Test.TEST.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return Test.TEST.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Test.TEST.CREATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field6() {
        return Test.TEST.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Test.TEST.MODIFIER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return Test.TEST.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Test.TEST.IS_DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeEnum component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getCreatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component6() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getModifierId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component8() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeEnum value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getCreatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value6() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getModifierId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord value3(TypeEnum value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord value4(LocalDateTime value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord value5(Long value) {
        setCreatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord value6(LocalDateTime value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord value7(Long value) {
        setModifierId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord value8(LocalDateTime value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord value9(Boolean value) {
        setIsDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRecord values(Long value1, String value2, TypeEnum value3, LocalDateTime value4, Long value5, LocalDateTime value6, Long value7, LocalDateTime value8, Boolean value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestRecord
     */
    public TestRecord() {
        super(Test.TEST);
    }

    /**
     * Create a detached, initialised TestRecord
     */
    public TestRecord(Long id, String name, TypeEnum type, LocalDateTime time, Long creatorId, LocalDateTime gmtCreate, Long modifierId, LocalDateTime gmtModified, Boolean isDeleted) {
        super(Test.TEST);

        set(0, id);
        set(1, name);
        set(2, type);
        set(3, time);
        set(4, creatorId);
        set(5, gmtCreate);
        set(6, modifierId);
        set(7, gmtModified);
        set(8, isDeleted);
    }
}
