package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DpSmallplacesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpSmallplacesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDpRespIdIsNull() {
            addCriterion("DP_RESP_ID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespIdIsNotNull() {
            addCriterion("DP_RESP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespIdEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ID =", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ID <>", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_ID >", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ID >=", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdLessThan(BigDecimal value) {
            addCriterion("DP_RESP_ID <", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_ID <=", value, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_ID in", values, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_ID not in", values, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_ID between", value1, value2, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_ID not between", value1, value2, "dpRespId");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeIsNull() {
            addCriterion("DP_RESP_UNITCODE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeIsNotNull() {
            addCriterion("DP_RESP_UNITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeEqualTo(String value) {
            addCriterion("DP_RESP_UNITCODE =", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeNotEqualTo(String value) {
            addCriterion("DP_RESP_UNITCODE <>", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeGreaterThan(String value) {
            addCriterion("DP_RESP_UNITCODE >", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITCODE >=", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeLessThan(String value) {
            addCriterion("DP_RESP_UNITCODE <", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITCODE <=", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeLike(String value) {
            addCriterion("DP_RESP_UNITCODE like", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeNotLike(String value) {
            addCriterion("DP_RESP_UNITCODE not like", value, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeIn(List<String> values) {
            addCriterion("DP_RESP_UNITCODE in", values, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeNotIn(List<String> values) {
            addCriterion("DP_RESP_UNITCODE not in", values, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITCODE between", value1, value2, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitcodeNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITCODE not between", value1, value2, "dpRespUnitcode");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameIsNull() {
            addCriterion("DP_RESP_UNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameIsNotNull() {
            addCriterion("DP_RESP_UNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameEqualTo(String value) {
            addCriterion("DP_RESP_UNITNAME =", value, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameNotEqualTo(String value) {
            addCriterion("DP_RESP_UNITNAME <>", value, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameGreaterThan(String value) {
            addCriterion("DP_RESP_UNITNAME >", value, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITNAME >=", value, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameLessThan(String value) {
            addCriterion("DP_RESP_UNITNAME <", value, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITNAME <=", value, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameLike(String value) {
            addCriterion("DP_RESP_UNITNAME like", value, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameNotLike(String value) {
            addCriterion("DP_RESP_UNITNAME not like", value, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameIn(List<String> values) {
            addCriterion("DP_RESP_UNITNAME in", values, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameNotIn(List<String> values) {
            addCriterion("DP_RESP_UNITNAME not in", values, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITNAME between", value1, value2, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitnameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITNAME not between", value1, value2, "dpRespUnitname");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneIsNull() {
            addCriterion("DP_RESP_UNITPHONE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneIsNotNull() {
            addCriterion("DP_RESP_UNITPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneEqualTo(String value) {
            addCriterion("DP_RESP_UNITPHONE =", value, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneNotEqualTo(String value) {
            addCriterion("DP_RESP_UNITPHONE <>", value, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneGreaterThan(String value) {
            addCriterion("DP_RESP_UNITPHONE >", value, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITPHONE >=", value, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneLessThan(String value) {
            addCriterion("DP_RESP_UNITPHONE <", value, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITPHONE <=", value, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneLike(String value) {
            addCriterion("DP_RESP_UNITPHONE like", value, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneNotLike(String value) {
            addCriterion("DP_RESP_UNITPHONE not like", value, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneIn(List<String> values) {
            addCriterion("DP_RESP_UNITPHONE in", values, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneNotIn(List<String> values) {
            addCriterion("DP_RESP_UNITPHONE not in", values, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITPHONE between", value1, value2, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitphoneNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITPHONE not between", value1, value2, "dpRespUnitphone");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressIsNull() {
            addCriterion("DP_RESP_UNITADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressIsNotNull() {
            addCriterion("DP_RESP_UNITADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressEqualTo(String value) {
            addCriterion("DP_RESP_UNITADDRESS =", value, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressNotEqualTo(String value) {
            addCriterion("DP_RESP_UNITADDRESS <>", value, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressGreaterThan(String value) {
            addCriterion("DP_RESP_UNITADDRESS >", value, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITADDRESS >=", value, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressLessThan(String value) {
            addCriterion("DP_RESP_UNITADDRESS <", value, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_UNITADDRESS <=", value, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressLike(String value) {
            addCriterion("DP_RESP_UNITADDRESS like", value, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressNotLike(String value) {
            addCriterion("DP_RESP_UNITADDRESS not like", value, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressIn(List<String> values) {
            addCriterion("DP_RESP_UNITADDRESS in", values, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressNotIn(List<String> values) {
            addCriterion("DP_RESP_UNITADDRESS not in", values, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITADDRESS between", value1, value2, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespUnitaddressNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_UNITADDRESS not between", value1, value2, "dpRespUnitaddress");
            return (Criteria) this;
        }

        public Criteria andDpRespXIsNull() {
            addCriterion("DP_RESP_X is null");
            return (Criteria) this;
        }

        public Criteria andDpRespXIsNotNull() {
            addCriterion("DP_RESP_X is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespXEqualTo(String value) {
            addCriterion("DP_RESP_X =", value, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXNotEqualTo(String value) {
            addCriterion("DP_RESP_X <>", value, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXGreaterThan(String value) {
            addCriterion("DP_RESP_X >", value, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_X >=", value, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXLessThan(String value) {
            addCriterion("DP_RESP_X <", value, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_X <=", value, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXLike(String value) {
            addCriterion("DP_RESP_X like", value, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXNotLike(String value) {
            addCriterion("DP_RESP_X not like", value, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXIn(List<String> values) {
            addCriterion("DP_RESP_X in", values, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXNotIn(List<String> values) {
            addCriterion("DP_RESP_X not in", values, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXBetween(String value1, String value2) {
            addCriterion("DP_RESP_X between", value1, value2, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespXNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_X not between", value1, value2, "dpRespX");
            return (Criteria) this;
        }

        public Criteria andDpRespYIsNull() {
            addCriterion("DP_RESP_Y is null");
            return (Criteria) this;
        }

        public Criteria andDpRespYIsNotNull() {
            addCriterion("DP_RESP_Y is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespYEqualTo(String value) {
            addCriterion("DP_RESP_Y =", value, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYNotEqualTo(String value) {
            addCriterion("DP_RESP_Y <>", value, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYGreaterThan(String value) {
            addCriterion("DP_RESP_Y >", value, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_Y >=", value, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYLessThan(String value) {
            addCriterion("DP_RESP_Y <", value, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_Y <=", value, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYLike(String value) {
            addCriterion("DP_RESP_Y like", value, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYNotLike(String value) {
            addCriterion("DP_RESP_Y not like", value, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYIn(List<String> values) {
            addCriterion("DP_RESP_Y in", values, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYNotIn(List<String> values) {
            addCriterion("DP_RESP_Y not in", values, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYBetween(String value1, String value2) {
            addCriterion("DP_RESP_Y between", value1, value2, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespYNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_Y not between", value1, value2, "dpRespY");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationIsNull() {
            addCriterion("DP_RESP_CORPORATION is null");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationIsNotNull() {
            addCriterion("DP_RESP_CORPORATION is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationEqualTo(String value) {
            addCriterion("DP_RESP_CORPORATION =", value, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationNotEqualTo(String value) {
            addCriterion("DP_RESP_CORPORATION <>", value, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationGreaterThan(String value) {
            addCriterion("DP_RESP_CORPORATION >", value, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_CORPORATION >=", value, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationLessThan(String value) {
            addCriterion("DP_RESP_CORPORATION <", value, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_CORPORATION <=", value, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationLike(String value) {
            addCriterion("DP_RESP_CORPORATION like", value, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationNotLike(String value) {
            addCriterion("DP_RESP_CORPORATION not like", value, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationIn(List<String> values) {
            addCriterion("DP_RESP_CORPORATION in", values, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationNotIn(List<String> values) {
            addCriterion("DP_RESP_CORPORATION not in", values, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationBetween(String value1, String value2) {
            addCriterion("DP_RESP_CORPORATION between", value1, value2, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_CORPORATION not between", value1, value2, "dpRespCorporation");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneIsNull() {
            addCriterion("DP_RESP_CORPORATIONPHONE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneIsNotNull() {
            addCriterion("DP_RESP_CORPORATIONPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneEqualTo(String value) {
            addCriterion("DP_RESP_CORPORATIONPHONE =", value, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneNotEqualTo(String value) {
            addCriterion("DP_RESP_CORPORATIONPHONE <>", value, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneGreaterThan(String value) {
            addCriterion("DP_RESP_CORPORATIONPHONE >", value, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_CORPORATIONPHONE >=", value, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneLessThan(String value) {
            addCriterion("DP_RESP_CORPORATIONPHONE <", value, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_CORPORATIONPHONE <=", value, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneLike(String value) {
            addCriterion("DP_RESP_CORPORATIONPHONE like", value, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneNotLike(String value) {
            addCriterion("DP_RESP_CORPORATIONPHONE not like", value, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneIn(List<String> values) {
            addCriterion("DP_RESP_CORPORATIONPHONE in", values, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneNotIn(List<String> values) {
            addCriterion("DP_RESP_CORPORATIONPHONE not in", values, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneBetween(String value1, String value2) {
            addCriterion("DP_RESP_CORPORATIONPHONE between", value1, value2, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespCorporationphoneNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_CORPORATIONPHONE not between", value1, value2, "dpRespCorporationphone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableIsNull() {
            addCriterion("DP_RESP_LIABLE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableIsNotNull() {
            addCriterion("DP_RESP_LIABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableEqualTo(String value) {
            addCriterion("DP_RESP_LIABLE =", value, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableNotEqualTo(String value) {
            addCriterion("DP_RESP_LIABLE <>", value, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableGreaterThan(String value) {
            addCriterion("DP_RESP_LIABLE >", value, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_LIABLE >=", value, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableLessThan(String value) {
            addCriterion("DP_RESP_LIABLE <", value, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_LIABLE <=", value, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableLike(String value) {
            addCriterion("DP_RESP_LIABLE like", value, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableNotLike(String value) {
            addCriterion("DP_RESP_LIABLE not like", value, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableIn(List<String> values) {
            addCriterion("DP_RESP_LIABLE in", values, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableNotIn(List<String> values) {
            addCriterion("DP_RESP_LIABLE not in", values, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableBetween(String value1, String value2) {
            addCriterion("DP_RESP_LIABLE between", value1, value2, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiableNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_LIABLE not between", value1, value2, "dpRespLiable");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneIsNull() {
            addCriterion("DP_RESP_LIABLEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneIsNotNull() {
            addCriterion("DP_RESP_LIABLEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneEqualTo(String value) {
            addCriterion("DP_RESP_LIABLEPHONE =", value, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneNotEqualTo(String value) {
            addCriterion("DP_RESP_LIABLEPHONE <>", value, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneGreaterThan(String value) {
            addCriterion("DP_RESP_LIABLEPHONE >", value, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_LIABLEPHONE >=", value, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneLessThan(String value) {
            addCriterion("DP_RESP_LIABLEPHONE <", value, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_LIABLEPHONE <=", value, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneLike(String value) {
            addCriterion("DP_RESP_LIABLEPHONE like", value, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneNotLike(String value) {
            addCriterion("DP_RESP_LIABLEPHONE not like", value, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneIn(List<String> values) {
            addCriterion("DP_RESP_LIABLEPHONE in", values, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneNotIn(List<String> values) {
            addCriterion("DP_RESP_LIABLEPHONE not in", values, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneBetween(String value1, String value2) {
            addCriterion("DP_RESP_LIABLEPHONE between", value1, value2, "dpRespLiablephone");
            return (Criteria) this;
        }

        public Criteria andDpRespLiablephoneNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_LIABLEPHONE not between", value1, value2, "dpRespLiablephone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}