package com.hd.software.dcaamsp.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DpDetachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DpDetachmentExample() {
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

        public Criteria andDpRespNameIsNull() {
            addCriterion("DP_RESP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDpRespNameIsNotNull() {
            addCriterion("DP_RESP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespNameEqualTo(String value) {
            addCriterion("DP_RESP_NAME =", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameNotEqualTo(String value) {
            addCriterion("DP_RESP_NAME <>", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameGreaterThan(String value) {
            addCriterion("DP_RESP_NAME >", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_NAME >=", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameLessThan(String value) {
            addCriterion("DP_RESP_NAME <", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_NAME <=", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameLike(String value) {
            addCriterion("DP_RESP_NAME like", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameNotLike(String value) {
            addCriterion("DP_RESP_NAME not like", value, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameIn(List<String> values) {
            addCriterion("DP_RESP_NAME in", values, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameNotIn(List<String> values) {
            addCriterion("DP_RESP_NAME not in", values, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameBetween(String value1, String value2) {
            addCriterion("DP_RESP_NAME between", value1, value2, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespNameNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_NAME not between", value1, value2, "dpRespName");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedIsNull() {
            addCriterion("DP_RESP_ABBREVIATED is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedIsNotNull() {
            addCriterion("DP_RESP_ABBREVIATED is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedEqualTo(String value) {
            addCriterion("DP_RESP_ABBREVIATED =", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedNotEqualTo(String value) {
            addCriterion("DP_RESP_ABBREVIATED <>", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedGreaterThan(String value) {
            addCriterion("DP_RESP_ABBREVIATED >", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ABBREVIATED >=", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedLessThan(String value) {
            addCriterion("DP_RESP_ABBREVIATED <", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ABBREVIATED <=", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedLike(String value) {
            addCriterion("DP_RESP_ABBREVIATED like", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedNotLike(String value) {
            addCriterion("DP_RESP_ABBREVIATED not like", value, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedIn(List<String> values) {
            addCriterion("DP_RESP_ABBREVIATED in", values, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedNotIn(List<String> values) {
            addCriterion("DP_RESP_ABBREVIATED not in", values, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedBetween(String value1, String value2) {
            addCriterion("DP_RESP_ABBREVIATED between", value1, value2, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAbbreviatedNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ABBREVIATED not between", value1, value2, "dpRespAbbreviated");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrIsNull() {
            addCriterion("DP_RESP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrIsNotNull() {
            addCriterion("DP_RESP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrEqualTo(String value) {
            addCriterion("DP_RESP_ADDR =", value, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrNotEqualTo(String value) {
            addCriterion("DP_RESP_ADDR <>", value, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrGreaterThan(String value) {
            addCriterion("DP_RESP_ADDR >", value, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ADDR >=", value, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrLessThan(String value) {
            addCriterion("DP_RESP_ADDR <", value, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_ADDR <=", value, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrLike(String value) {
            addCriterion("DP_RESP_ADDR like", value, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrNotLike(String value) {
            addCriterion("DP_RESP_ADDR not like", value, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrIn(List<String> values) {
            addCriterion("DP_RESP_ADDR in", values, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrNotIn(List<String> values) {
            addCriterion("DP_RESP_ADDR not in", values, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrBetween(String value1, String value2) {
            addCriterion("DP_RESP_ADDR between", value1, value2, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespAddrNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_ADDR not between", value1, value2, "dpRespAddr");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneIsNull() {
            addCriterion("DP_RESP_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneIsNotNull() {
            addCriterion("DP_RESP_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneEqualTo(String value) {
            addCriterion("DP_RESP_TELEPHONE =", value, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneNotEqualTo(String value) {
            addCriterion("DP_RESP_TELEPHONE <>", value, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneGreaterThan(String value) {
            addCriterion("DP_RESP_TELEPHONE >", value, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_TELEPHONE >=", value, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneLessThan(String value) {
            addCriterion("DP_RESP_TELEPHONE <", value, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_TELEPHONE <=", value, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneLike(String value) {
            addCriterion("DP_RESP_TELEPHONE like", value, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneNotLike(String value) {
            addCriterion("DP_RESP_TELEPHONE not like", value, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneIn(List<String> values) {
            addCriterion("DP_RESP_TELEPHONE in", values, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneNotIn(List<String> values) {
            addCriterion("DP_RESP_TELEPHONE not in", values, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneBetween(String value1, String value2) {
            addCriterion("DP_RESP_TELEPHONE between", value1, value2, "dpRespTelephone");
            return (Criteria) this;
        }

        public Criteria andDpRespTelephoneNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_TELEPHONE not between", value1, value2, "dpRespTelephone");
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

        public Criteria andDpRespFireBigTeamIsNull() {
            addCriterion("DP_RESP_FIRE_BIG_TEAM is null");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamIsNotNull() {
            addCriterion("DP_RESP_FIRE_BIG_TEAM is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamEqualTo(String value) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM =", value, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamNotEqualTo(String value) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM <>", value, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamGreaterThan(String value) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM >", value, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM >=", value, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamLessThan(String value) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM <", value, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM <=", value, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamLike(String value) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM like", value, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamNotLike(String value) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM not like", value, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamIn(List<String> values) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM in", values, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamNotIn(List<String> values) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM not in", values, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamBetween(String value1, String value2) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM between", value1, value2, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireBigTeamNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_FIRE_BIG_TEAM not between", value1, value2, "dpRespFireBigTeam");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronIsNull() {
            addCriterion("DP_RESP_FIRE_SQUADRON is null");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronIsNotNull() {
            addCriterion("DP_RESP_FIRE_SQUADRON is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronEqualTo(String value) {
            addCriterion("DP_RESP_FIRE_SQUADRON =", value, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronNotEqualTo(String value) {
            addCriterion("DP_RESP_FIRE_SQUADRON <>", value, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronGreaterThan(String value) {
            addCriterion("DP_RESP_FIRE_SQUADRON >", value, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FIRE_SQUADRON >=", value, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronLessThan(String value) {
            addCriterion("DP_RESP_FIRE_SQUADRON <", value, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_FIRE_SQUADRON <=", value, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronLike(String value) {
            addCriterion("DP_RESP_FIRE_SQUADRON like", value, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronNotLike(String value) {
            addCriterion("DP_RESP_FIRE_SQUADRON not like", value, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronIn(List<String> values) {
            addCriterion("DP_RESP_FIRE_SQUADRON in", values, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronNotIn(List<String> values) {
            addCriterion("DP_RESP_FIRE_SQUADRON not in", values, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronBetween(String value1, String value2) {
            addCriterion("DP_RESP_FIRE_SQUADRON between", value1, value2, "dpRespFireSquadron");
            return (Criteria) this;
        }

        public Criteria andDpRespFireSquadronNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_FIRE_SQUADRON not between", value1, value2, "dpRespFireSquadron");
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

        public Criteria andDpRespPhoneIsNull() {
            addCriterion("DP_RESP_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneIsNotNull() {
            addCriterion("DP_RESP_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneEqualTo(String value) {
            addCriterion("DP_RESP_PHONE =", value, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneNotEqualTo(String value) {
            addCriterion("DP_RESP_PHONE <>", value, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneGreaterThan(String value) {
            addCriterion("DP_RESP_PHONE >", value, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PHONE >=", value, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneLessThan(String value) {
            addCriterion("DP_RESP_PHONE <", value, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_PHONE <=", value, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneLike(String value) {
            addCriterion("DP_RESP_PHONE like", value, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneNotLike(String value) {
            addCriterion("DP_RESP_PHONE not like", value, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneIn(List<String> values) {
            addCriterion("DP_RESP_PHONE in", values, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneNotIn(List<String> values) {
            addCriterion("DP_RESP_PHONE not in", values, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneBetween(String value1, String value2) {
            addCriterion("DP_RESP_PHONE between", value1, value2, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespPhoneNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_PHONE not between", value1, value2, "dpRespPhone");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaIsNull() {
            addCriterion("DP_RESP_AREA is null");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaIsNotNull() {
            addCriterion("DP_RESP_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaEqualTo(String value) {
            addCriterion("DP_RESP_AREA =", value, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaNotEqualTo(String value) {
            addCriterion("DP_RESP_AREA <>", value, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaGreaterThan(String value) {
            addCriterion("DP_RESP_AREA >", value, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AREA >=", value, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaLessThan(String value) {
            addCriterion("DP_RESP_AREA <", value, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_AREA <=", value, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaLike(String value) {
            addCriterion("DP_RESP_AREA like", value, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaNotLike(String value) {
            addCriterion("DP_RESP_AREA not like", value, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaIn(List<String> values) {
            addCriterion("DP_RESP_AREA in", values, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaNotIn(List<String> values) {
            addCriterion("DP_RESP_AREA not in", values, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaBetween(String value1, String value2) {
            addCriterion("DP_RESP_AREA between", value1, value2, "dpRespArea");
            return (Criteria) this;
        }

        public Criteria andDpRespAreaNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_AREA not between", value1, value2, "dpRespArea");
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

        public Criteria andDpRespGisXEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_GIS_X =", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_GIS_X <>", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_GIS_X >", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_GIS_X >=", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXLessThan(BigDecimal value) {
            addCriterion("DP_RESP_GIS_X <", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_GIS_X <=", value, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_GIS_X in", values, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_GIS_X not in", values, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_GIS_X between", value1, value2, "dpRespGisX");
            return (Criteria) this;
        }

        public Criteria andDpRespGisXNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andDpRespGisYEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_GIS_Y =", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_GIS_Y <>", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYGreaterThan(BigDecimal value) {
            addCriterion("DP_RESP_GIS_Y >", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_GIS_Y >=", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYLessThan(BigDecimal value) {
            addCriterion("DP_RESP_GIS_Y <", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DP_RESP_GIS_Y <=", value, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_GIS_Y in", values, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotIn(List<BigDecimal> values) {
            addCriterion("DP_RESP_GIS_Y not in", values, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DP_RESP_GIS_Y between", value1, value2, "dpRespGisY");
            return (Criteria) this;
        }

        public Criteria andDpRespGisYNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andDpRespSquadronidIsNull() {
            addCriterion("DP_RESP_SQUADRONID is null");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidIsNotNull() {
            addCriterion("DP_RESP_SQUADRONID is not null");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONID =", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidNotEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONID <>", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidGreaterThan(String value) {
            addCriterion("DP_RESP_SQUADRONID >", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidGreaterThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONID >=", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidLessThan(String value) {
            addCriterion("DP_RESP_SQUADRONID <", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidLessThanOrEqualTo(String value) {
            addCriterion("DP_RESP_SQUADRONID <=", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidLike(String value) {
            addCriterion("DP_RESP_SQUADRONID like", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidNotLike(String value) {
            addCriterion("DP_RESP_SQUADRONID not like", value, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidIn(List<String> values) {
            addCriterion("DP_RESP_SQUADRONID in", values, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidNotIn(List<String> values) {
            addCriterion("DP_RESP_SQUADRONID not in", values, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidBetween(String value1, String value2) {
            addCriterion("DP_RESP_SQUADRONID between", value1, value2, "dpRespSquadronid");
            return (Criteria) this;
        }

        public Criteria andDpRespSquadronidNotBetween(String value1, String value2) {
            addCriterion("DP_RESP_SQUADRONID not between", value1, value2, "dpRespSquadronid");
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