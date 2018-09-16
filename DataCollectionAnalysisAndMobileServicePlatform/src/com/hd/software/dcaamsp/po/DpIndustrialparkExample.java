package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DpIndustrialparkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpIndustrialparkExample() {
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

        public Criteria andDpRespParknameIsNull() {
            addCriterion("DP_RESP_PARKNAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameIsNotNull() {
            addCriterion("DP_RESP_PARKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameEqualTo(String value) {
            addCriterion("DP_RESP_PARKNAME =", value, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameNotEqualTo(String value) {
            addCriterion("DP_RESP_PARKNAME <>", value, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameGreaterThan(String value) {
            addCriterion("DP_RESP_PARKNAME >", value, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PARKNAME >=", value, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameLessThan(String value) {
            addCriterion("DP_RESP_PARKNAME <", value, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PARKNAME <=", value, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameLike(String value) {
            addCriterion("DP_RESP_PARKNAME like", value, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameNotLike(String value) {
            addCriterion("DP_RESP_PARKNAME not like", value, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameIn(List<String> values) {
            addCriterion("DP_RESP_PARKNAME in", values, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameNotIn(List<String> values) {
            addCriterion("DP_RESP_PARKNAME not in", values, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameBetween(String value1, String value2) {
            addCriterion("DP_RESP_PARKNAME between", value1, value2, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParknameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_PARKNAME not between", value1, value2, "dpRespParkname");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidIsNull() {
            addCriterion("DP_RESP_PARKID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidIsNotNull() {
            addCriterion("DP_RESP_PARKID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidEqualTo(String value) {
            addCriterion("DP_RESP_PARKID =", value, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidNotEqualTo(String value) {
            addCriterion("DP_RESP_PARKID <>", value, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidGreaterThan(String value) {
            addCriterion("DP_RESP_PARKID >", value, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PARKID >=", value, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidLessThan(String value) {
            addCriterion("DP_RESP_PARKID <", value, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PARKID <=", value, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidLike(String value) {
            addCriterion("DP_RESP_PARKID like", value, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidNotLike(String value) {
            addCriterion("DP_RESP_PARKID not like", value, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidIn(List<String> values) {
            addCriterion("DP_RESP_PARKID in", values, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidNotIn(List<String> values) {
            addCriterion("DP_RESP_PARKID not in", values, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidBetween(String value1, String value2) {
            addCriterion("DP_RESP_PARKID between", value1, value2, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespParkidNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_PARKID not between", value1, value2, "dpRespParkid");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryIsNull() {
            addCriterion("DP_RESP_SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryIsNotNull() {
            addCriterion("DP_RESP_SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryEqualTo(String value) {
            addCriterion("DP_RESP_SUMMARY =", value, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryNotEqualTo(String value) {
            addCriterion("DP_RESP_SUMMARY <>", value, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryGreaterThan(String value) {
            addCriterion("DP_RESP_SUMMARY >", value, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SUMMARY >=", value, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryLessThan(String value) {
            addCriterion("DP_RESP_SUMMARY <", value, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SUMMARY <=", value, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryLike(String value) {
            addCriterion("DP_RESP_SUMMARY like", value, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryNotLike(String value) {
            addCriterion("DP_RESP_SUMMARY not like", value, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryIn(List<String> values) {
            addCriterion("DP_RESP_SUMMARY in", values, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryNotIn(List<String> values) {
            addCriterion("DP_RESP_SUMMARY not in", values, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryBetween(String value1, String value2) {
            addCriterion("DP_RESP_SUMMARY between", value1, value2, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespSummaryNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_SUMMARY not between", value1, value2, "dpRespSummary");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressIsNull() {
            addCriterion("DP_RESP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressIsNotNull() {
            addCriterion("DP_RESP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressEqualTo(String value) {
            addCriterion("DP_RESP_ADDRESS =", value, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressNotEqualTo(String value) {
            addCriterion("DP_RESP_ADDRESS <>", value, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressGreaterThan(String value) {
            addCriterion("DP_RESP_ADDRESS >", value, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ADDRESS >=", value, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressLessThan(String value) {
            addCriterion("DP_RESP_ADDRESS <", value, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ADDRESS <=", value, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressLike(String value) {
            addCriterion("DP_RESP_ADDRESS like", value, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressNotLike(String value) {
            addCriterion("DP_RESP_ADDRESS not like", value, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressIn(List<String> values) {
            addCriterion("DP_RESP_ADDRESS in", values, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressNotIn(List<String> values) {
            addCriterion("DP_RESP_ADDRESS not in", values, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressBetween(String value1, String value2) {
            addCriterion("DP_RESP_ADDRESS between", value1, value2, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespAddressNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ADDRESS not between", value1, value2, "dpRespAddress");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkIsNull() {
            addCriterion("DP_RESP_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkIsNotNull() {
            addCriterion("DP_RESP_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkEqualTo(String value) {
            addCriterion("DP_RESP_REMARK =", value, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkNotEqualTo(String value) {
            addCriterion("DP_RESP_REMARK <>", value, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkGreaterThan(String value) {
            addCriterion("DP_RESP_REMARK >", value, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_REMARK >=", value, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkLessThan(String value) {
            addCriterion("DP_RESP_REMARK <", value, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_REMARK <=", value, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkLike(String value) {
            addCriterion("DP_RESP_REMARK like", value, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkNotLike(String value) {
            addCriterion("DP_RESP_REMARK not like", value, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkIn(List<String> values) {
            addCriterion("DP_RESP_REMARK in", values, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkNotIn(List<String> values) {
            addCriterion("DP_RESP_REMARK not in", values, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkBetween(String value1, String value2) {
            addCriterion("DP_RESP_REMARK between", value1, value2, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespRemarkNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_REMARK not between", value1, value2, "dpRespRemark");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXIsNull() {
            addCriterion("DP_RESP_GIS_X is null");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXIsNotNull() {
            addCriterion("DP_RESP_GIS_X is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXEqualTo(String value) {
            addCriterion("DP_RESP_GIS_X =", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotEqualTo(String value) {
            addCriterion("DP_RESP_GIS_X <>", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXGreaterThan(String value) {
            addCriterion("DP_RESP_GIS_X >", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GIS_X >=", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXLessThan(String value) {
            addCriterion("DP_RESP_GIS_X <", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GIS_X <=", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXLike(String value) {
            addCriterion("DP_RESP_GIS_X like", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotLike(String value) {
            addCriterion("DP_RESP_GIS_X not like", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXIn(List<String> values) {
            addCriterion("DP_RESP_GIS_X in", values, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotIn(List<String> values) {
            addCriterion("DP_RESP_GIS_X not in", values, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXBetween(String value1, String value2) {
            addCriterion("DP_RESP_GIS_X between", value1, value2, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_GIS_X not between", value1, value2, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYIsNull() {
            addCriterion("DP_RESP_GIS_Y is null");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYIsNotNull() {
            addCriterion("DP_RESP_GIS_Y is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYEqualTo(String value) {
            addCriterion("DP_RESP_GIS_Y =", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotEqualTo(String value) {
            addCriterion("DP_RESP_GIS_Y <>", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYGreaterThan(String value) {
            addCriterion("DP_RESP_GIS_Y >", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GIS_Y >=", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYLessThan(String value) {
            addCriterion("DP_RESP_GIS_Y <", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_GIS_Y <=", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYLike(String value) {
            addCriterion("DP_RESP_GIS_Y like", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotLike(String value) {
            addCriterion("DP_RESP_GIS_Y not like", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYIn(List<String> values) {
            addCriterion("DP_RESP_GIS_Y in", values, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotIn(List<String> values) {
            addCriterion("DP_RESP_GIS_Y not in", values, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYBetween(String value1, String value2) {
            addCriterion("DP_RESP_GIS_Y between", value1, value2, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_GIS_Y not between", value1, value2, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidIsNull() {
            addCriterion("DP_RESP_DETACHMENTID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidIsNotNull() {
            addCriterion("DP_RESP_DETACHMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidEqualTo(String value) {
            addCriterion("DP_RESP_DETACHMENTID =", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidNotEqualTo(String value) {
            addCriterion("DP_RESP_DETACHMENTID <>", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidGreaterThan(String value) {
            addCriterion("DP_RESP_DETACHMENTID >", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DETACHMENTID >=", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidLessThan(String value) {
            addCriterion("DP_RESP_DETACHMENTID <", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DETACHMENTID <=", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidLike(String value) {
            addCriterion("DP_RESP_DETACHMENTID like", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidNotLike(String value) {
            addCriterion("DP_RESP_DETACHMENTID not like", value, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidIn(List<String> values) {
            addCriterion("DP_RESP_DETACHMENTID in", values, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidNotIn(List<String> values) {
            addCriterion("DP_RESP_DETACHMENTID not in", values, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidBetween(String value1, String value2) {
            addCriterion("DP_RESP_DETACHMENTID between", value1, value2, "dpRespDetachmentid");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachmentidNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DETACHMENTID not between", value1, value2, "dpRespDetachmentid");
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