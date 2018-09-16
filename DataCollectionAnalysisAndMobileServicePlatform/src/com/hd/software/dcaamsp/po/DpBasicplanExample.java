package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DpBasicplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpBasicplanExample() {
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

        public Criteria andDpRespIdentifierIsNull() {
            addCriterion("DP_RESP_IDENTIFIER is null");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierIsNotNull() {
            addCriterion("DP_RESP_IDENTIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierEqualTo(String value) {
            addCriterion("DP_RESP_IDENTIFIER =", value, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierNotEqualTo(String value) {
            addCriterion("DP_RESP_IDENTIFIER <>", value, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierGreaterThan(String value) {
            addCriterion("DP_RESP_IDENTIFIER >", value, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_IDENTIFIER >=", value, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierLessThan(String value) {
            addCriterion("DP_RESP_IDENTIFIER <", value, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_IDENTIFIER <=", value, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierLike(String value) {
            addCriterion("DP_RESP_IDENTIFIER like", value, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierNotLike(String value) {
            addCriterion("DP_RESP_IDENTIFIER not like", value, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierIn(List<String> values) {
            addCriterion("DP_RESP_IDENTIFIER in", values, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierNotIn(List<String> values) {
            addCriterion("DP_RESP_IDENTIFIER not in", values, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierBetween(String value1, String value2) {
            addCriterion("DP_RESP_IDENTIFIER between", value1, value2, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespIdentifierNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_IDENTIFIER not between", value1, value2, "dpRespIdentifier");
            return (Criteria) this;
        }

        public Criteria andDpRespDateIsNull() {
            addCriterion("DP_RESP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDateIsNotNull() {
            addCriterion("DP_RESP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDateEqualTo(String value) {
            addCriterion("DP_RESP_DATE =", value, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateNotEqualTo(String value) {
            addCriterion("DP_RESP_DATE <>", value, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateGreaterThan(String value) {
            addCriterion("DP_RESP_DATE >", value, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DATE >=", value, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateLessThan(String value) {
            addCriterion("DP_RESP_DATE <", value, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DATE <=", value, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateLike(String value) {
            addCriterion("DP_RESP_DATE like", value, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateNotLike(String value) {
            addCriterion("DP_RESP_DATE not like", value, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateIn(List<String> values) {
            addCriterion("DP_RESP_DATE in", values, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateNotIn(List<String> values) {
            addCriterion("DP_RESP_DATE not in", values, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateBetween(String value1, String value2) {
            addCriterion("DP_RESP_DATE between", value1, value2, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespDateNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DATE not between", value1, value2, "dpRespDate");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameIsNull() {
            addCriterion("DP_RESP_PLANNAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameIsNotNull() {
            addCriterion("DP_RESP_PLANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameEqualTo(String value) {
            addCriterion("DP_RESP_PLANNAME =", value, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameNotEqualTo(String value) {
            addCriterion("DP_RESP_PLANNAME <>", value, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameGreaterThan(String value) {
            addCriterion("DP_RESP_PLANNAME >", value, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PLANNAME >=", value, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameLessThan(String value) {
            addCriterion("DP_RESP_PLANNAME <", value, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PLANNAME <=", value, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameLike(String value) {
            addCriterion("DP_RESP_PLANNAME like", value, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameNotLike(String value) {
            addCriterion("DP_RESP_PLANNAME not like", value, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameIn(List<String> values) {
            addCriterion("DP_RESP_PLANNAME in", values, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameNotIn(List<String> values) {
            addCriterion("DP_RESP_PLANNAME not in", values, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameBetween(String value1, String value2) {
            addCriterion("DP_RESP_PLANNAME between", value1, value2, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespPlannameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_PLANNAME not between", value1, value2, "dpRespPlanname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameIsNull() {
            addCriterion("DP_RESP_COMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameIsNotNull() {
            addCriterion("DP_RESP_COMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameEqualTo(String value) {
            addCriterion("DP_RESP_COMPANYNAME =", value, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameNotEqualTo(String value) {
            addCriterion("DP_RESP_COMPANYNAME <>", value, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameGreaterThan(String value) {
            addCriterion("DP_RESP_COMPANYNAME >", value, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_COMPANYNAME >=", value, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameLessThan(String value) {
            addCriterion("DP_RESP_COMPANYNAME <", value, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_COMPANYNAME <=", value, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameLike(String value) {
            addCriterion("DP_RESP_COMPANYNAME like", value, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameNotLike(String value) {
            addCriterion("DP_RESP_COMPANYNAME not like", value, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameIn(List<String> values) {
            addCriterion("DP_RESP_COMPANYNAME in", values, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameNotIn(List<String> values) {
            addCriterion("DP_RESP_COMPANYNAME not in", values, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameBetween(String value1, String value2) {
            addCriterion("DP_RESP_COMPANYNAME between", value1, value2, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespCompanynameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_COMPANYNAME not between", value1, value2, "dpRespCompanyname");
            return (Criteria) this;
        }

        public Criteria andDpRespContactIsNull() {
            addCriterion("DP_RESP_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andDpRespContactIsNotNull() {
            addCriterion("DP_RESP_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespContactEqualTo(String value) {
            addCriterion("DP_RESP_CONTACT =", value, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactNotEqualTo(String value) {
            addCriterion("DP_RESP_CONTACT <>", value, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactGreaterThan(String value) {
            addCriterion("DP_RESP_CONTACT >", value, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_CONTACT >=", value, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactLessThan(String value) {
            addCriterion("DP_RESP_CONTACT <", value, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_CONTACT <=", value, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactLike(String value) {
            addCriterion("DP_RESP_CONTACT like", value, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactNotLike(String value) {
            addCriterion("DP_RESP_CONTACT not like", value, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactIn(List<String> values) {
            addCriterion("DP_RESP_CONTACT in", values, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactNotIn(List<String> values) {
            addCriterion("DP_RESP_CONTACT not in", values, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactBetween(String value1, String value2) {
            addCriterion("DP_RESP_CONTACT between", value1, value2, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespContactNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_CONTACT not between", value1, value2, "dpRespContact");
            return (Criteria) this;
        }

        public Criteria andDpRespPathIsNull() {
            addCriterion("DP_RESP_PATH is null");
            return (Criteria) this;
        }

        public Criteria andDpRespPathIsNotNull() {
            addCriterion("DP_RESP_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespPathEqualTo(String value) {
            addCriterion("DP_RESP_PATH =", value, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathNotEqualTo(String value) {
            addCriterion("DP_RESP_PATH <>", value, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathGreaterThan(String value) {
            addCriterion("DP_RESP_PATH >", value, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PATH >=", value, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathLessThan(String value) {
            addCriterion("DP_RESP_PATH <", value, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PATH <=", value, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathLike(String value) {
            addCriterion("DP_RESP_PATH like", value, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathNotLike(String value) {
            addCriterion("DP_RESP_PATH not like", value, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathIn(List<String> values) {
            addCriterion("DP_RESP_PATH in", values, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathNotIn(List<String> values) {
            addCriterion("DP_RESP_PATH not in", values, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathBetween(String value1, String value2) {
            addCriterion("DP_RESP_PATH between", value1, value2, "dpRespPath");
            return (Criteria) this;
        }

        public Criteria andDpRespPathNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_PATH not between", value1, value2, "dpRespPath");
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

        public Criteria andDpRespDetachnameIsNull() {
            addCriterion("DP_RESP_DETACHNAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameIsNotNull() {
            addCriterion("DP_RESP_DETACHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameEqualTo(String value) {
            addCriterion("DP_RESP_DETACHNAME =", value, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameNotEqualTo(String value) {
            addCriterion("DP_RESP_DETACHNAME <>", value, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameGreaterThan(String value) {
            addCriterion("DP_RESP_DETACHNAME >", value, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DETACHNAME >=", value, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameLessThan(String value) {
            addCriterion("DP_RESP_DETACHNAME <", value, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_DETACHNAME <=", value, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameLike(String value) {
            addCriterion("DP_RESP_DETACHNAME like", value, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameNotLike(String value) {
            addCriterion("DP_RESP_DETACHNAME not like", value, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameIn(List<String> values) {
            addCriterion("DP_RESP_DETACHNAME in", values, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameNotIn(List<String> values) {
            addCriterion("DP_RESP_DETACHNAME not in", values, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameBetween(String value1, String value2) {
            addCriterion("DP_RESP_DETACHNAME between", value1, value2, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespDetachnameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_DETACHNAME not between", value1, value2, "dpRespDetachname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameIsNull() {
            addCriterion("DP_RESP_SQUADRONNAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameIsNotNull() {
            addCriterion("DP_RESP_SQUADRONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONNAME =", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameNotEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONNAME <>", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameGreaterThan(String value) {
            addCriterion("DP_RESP_SQUADRONNAME >", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONNAME >=", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameLessThan(String value) {
            addCriterion("DP_RESP_SQUADRONNAME <", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONNAME <=", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameLike(String value) {
            addCriterion("DP_RESP_SQUADRONNAME like", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameNotLike(String value) {
            addCriterion("DP_RESP_SQUADRONNAME not like", value, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameIn(List<String> values) {
            addCriterion("DP_RESP_SQUADRONNAME in", values, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameNotIn(List<String> values) {
            addCriterion("DP_RESP_SQUADRONNAME not in", values, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameBetween(String value1, String value2) {
            addCriterion("DP_RESP_SQUADRONNAME between", value1, value2, "dpRespSquadronname");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronnameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_SQUADRONNAME not between", value1, value2, "dpRespSquadronname");
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