package com.yqwy.utopay_seAndRe.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsgInboxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgInboxExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIsNull() {
            addCriterion("MsgType is null");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIsNotNull() {
            addCriterion("MsgType is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtypeEqualTo(Integer value) {
            addCriterion("MsgType =", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotEqualTo(Integer value) {
            addCriterion("MsgType <>", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeGreaterThan(Integer value) {
            addCriterion("MsgType >", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MsgType >=", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLessThan(Integer value) {
            addCriterion("MsgType <", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeLessThanOrEqualTo(Integer value) {
            addCriterion("MsgType <=", value, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeIn(List<Integer> values) {
            addCriterion("MsgType in", values, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotIn(List<Integer> values) {
            addCriterion("MsgType not in", values, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeBetween(Integer value1, Integer value2) {
            addCriterion("MsgType between", value1, value2, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MsgType not between", value1, value2, "msgtype");
            return (Criteria) this;
        }

        public Criteria andMsgtitleIsNull() {
            addCriterion("MsgTitle is null");
            return (Criteria) this;
        }

        public Criteria andMsgtitleIsNotNull() {
            addCriterion("MsgTitle is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtitleEqualTo(String value) {
            addCriterion("MsgTitle =", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotEqualTo(String value) {
            addCriterion("MsgTitle <>", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleGreaterThan(String value) {
            addCriterion("MsgTitle >", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleGreaterThanOrEqualTo(String value) {
            addCriterion("MsgTitle >=", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleLessThan(String value) {
            addCriterion("MsgTitle <", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleLessThanOrEqualTo(String value) {
            addCriterion("MsgTitle <=", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleLike(String value) {
            addCriterion("MsgTitle like", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotLike(String value) {
            addCriterion("MsgTitle not like", value, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleIn(List<String> values) {
            addCriterion("MsgTitle in", values, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotIn(List<String> values) {
            addCriterion("MsgTitle not in", values, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleBetween(String value1, String value2) {
            addCriterion("MsgTitle between", value1, value2, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMsgtitleNotBetween(String value1, String value2) {
            addCriterion("MsgTitle not between", value1, value2, "msgtitle");
            return (Criteria) this;
        }

        public Criteria andMmsurlIsNull() {
            addCriterion("MMSUrl is null");
            return (Criteria) this;
        }

        public Criteria andMmsurlIsNotNull() {
            addCriterion("MMSUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMmsurlEqualTo(String value) {
            addCriterion("MMSUrl =", value, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlNotEqualTo(String value) {
            addCriterion("MMSUrl <>", value, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlGreaterThan(String value) {
            addCriterion("MMSUrl >", value, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlGreaterThanOrEqualTo(String value) {
            addCriterion("MMSUrl >=", value, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlLessThan(String value) {
            addCriterion("MMSUrl <", value, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlLessThanOrEqualTo(String value) {
            addCriterion("MMSUrl <=", value, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlLike(String value) {
            addCriterion("MMSUrl like", value, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlNotLike(String value) {
            addCriterion("MMSUrl not like", value, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlIn(List<String> values) {
            addCriterion("MMSUrl in", values, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlNotIn(List<String> values) {
            addCriterion("MMSUrl not in", values, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlBetween(String value1, String value2) {
            addCriterion("MMSUrl between", value1, value2, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmsurlNotBetween(String value1, String value2) {
            addCriterion("MMSUrl not between", value1, value2, "mmsurl");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationIsNull() {
            addCriterion("MMSContentLocation is null");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationIsNotNull() {
            addCriterion("MMSContentLocation is not null");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationEqualTo(String value) {
            addCriterion("MMSContentLocation =", value, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationNotEqualTo(String value) {
            addCriterion("MMSContentLocation <>", value, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationGreaterThan(String value) {
            addCriterion("MMSContentLocation >", value, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationGreaterThanOrEqualTo(String value) {
            addCriterion("MMSContentLocation >=", value, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationLessThan(String value) {
            addCriterion("MMSContentLocation <", value, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationLessThanOrEqualTo(String value) {
            addCriterion("MMSContentLocation <=", value, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationLike(String value) {
            addCriterion("MMSContentLocation like", value, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationNotLike(String value) {
            addCriterion("MMSContentLocation not like", value, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationIn(List<String> values) {
            addCriterion("MMSContentLocation in", values, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationNotIn(List<String> values) {
            addCriterion("MMSContentLocation not in", values, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationBetween(String value1, String value2) {
            addCriterion("MMSContentLocation between", value1, value2, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMmscontentlocationNotBetween(String value1, String value2) {
            addCriterion("MMSContentLocation not between", value1, value2, "mmscontentlocation");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeIsNull() {
            addCriterion("MsgArrivedTime is null");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeIsNotNull() {
            addCriterion("MsgArrivedTime is not null");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeEqualTo(Date value) {
            addCriterion("MsgArrivedTime =", value, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeNotEqualTo(Date value) {
            addCriterion("MsgArrivedTime <>", value, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeGreaterThan(Date value) {
            addCriterion("MsgArrivedTime >", value, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MsgArrivedTime >=", value, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeLessThan(Date value) {
            addCriterion("MsgArrivedTime <", value, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeLessThanOrEqualTo(Date value) {
            addCriterion("MsgArrivedTime <=", value, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeIn(List<Date> values) {
            addCriterion("MsgArrivedTime in", values, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeNotIn(List<Date> values) {
            addCriterion("MsgArrivedTime not in", values, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeBetween(Date value1, Date value2) {
            addCriterion("MsgArrivedTime between", value1, value2, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMsgarrivedtimeNotBetween(Date value1, Date value2) {
            addCriterion("MsgArrivedTime not between", value1, value2, "msgarrivedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeIsNull() {
            addCriterion("MMSDownloadedTime is null");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeIsNotNull() {
            addCriterion("MMSDownloadedTime is not null");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeEqualTo(Date value) {
            addCriterion("MMSDownloadedTime =", value, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeNotEqualTo(Date value) {
            addCriterion("MMSDownloadedTime <>", value, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeGreaterThan(Date value) {
            addCriterion("MMSDownloadedTime >", value, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MMSDownloadedTime >=", value, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeLessThan(Date value) {
            addCriterion("MMSDownloadedTime <", value, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeLessThanOrEqualTo(Date value) {
            addCriterion("MMSDownloadedTime <=", value, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeIn(List<Date> values) {
            addCriterion("MMSDownloadedTime in", values, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeNotIn(List<Date> values) {
            addCriterion("MMSDownloadedTime not in", values, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeBetween(Date value1, Date value2) {
            addCriterion("MMSDownloadedTime between", value1, value2, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedtimeNotBetween(Date value1, Date value2) {
            addCriterion("MMSDownloadedTime not between", value1, value2, "mmsdownloadedtime");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateIsNull() {
            addCriterion("MMSDownloadedState is null");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateIsNotNull() {
            addCriterion("MMSDownloadedState is not null");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateEqualTo(Integer value) {
            addCriterion("MMSDownloadedState =", value, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateNotEqualTo(Integer value) {
            addCriterion("MMSDownloadedState <>", value, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateGreaterThan(Integer value) {
            addCriterion("MMSDownloadedState >", value, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MMSDownloadedState >=", value, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateLessThan(Integer value) {
            addCriterion("MMSDownloadedState <", value, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateLessThanOrEqualTo(Integer value) {
            addCriterion("MMSDownloadedState <=", value, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateIn(List<Integer> values) {
            addCriterion("MMSDownloadedState in", values, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateNotIn(List<Integer> values) {
            addCriterion("MMSDownloadedState not in", values, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateBetween(Integer value1, Integer value2) {
            addCriterion("MMSDownloadedState between", value1, value2, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andMmsdownloadedstateNotBetween(Integer value1, Integer value2) {
            addCriterion("MMSDownloadedState not between", value1, value2, "mmsdownloadedstate");
            return (Criteria) this;
        }

        public Criteria andCommportIsNull() {
            addCriterion("CommPort is null");
            return (Criteria) this;
        }

        public Criteria andCommportIsNotNull() {
            addCriterion("CommPort is not null");
            return (Criteria) this;
        }

        public Criteria andCommportEqualTo(Integer value) {
            addCriterion("CommPort =", value, "commport");
            return (Criteria) this;
        }

        public Criteria andCommportNotEqualTo(Integer value) {
            addCriterion("CommPort <>", value, "commport");
            return (Criteria) this;
        }

        public Criteria andCommportGreaterThan(Integer value) {
            addCriterion("CommPort >", value, "commport");
            return (Criteria) this;
        }

        public Criteria andCommportGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommPort >=", value, "commport");
            return (Criteria) this;
        }

        public Criteria andCommportLessThan(Integer value) {
            addCriterion("CommPort <", value, "commport");
            return (Criteria) this;
        }

        public Criteria andCommportLessThanOrEqualTo(Integer value) {
            addCriterion("CommPort <=", value, "commport");
            return (Criteria) this;
        }

        public Criteria andCommportIn(List<Integer> values) {
            addCriterion("CommPort in", values, "commport");
            return (Criteria) this;
        }

        public Criteria andCommportNotIn(List<Integer> values) {
            addCriterion("CommPort not in", values, "commport");
            return (Criteria) this;
        }

        public Criteria andCommportBetween(Integer value1, Integer value2) {
            addCriterion("CommPort between", value1, value2, "commport");
            return (Criteria) this;
        }

        public Criteria andCommportNotBetween(Integer value1, Integer value2) {
            addCriterion("CommPort not between", value1, value2, "commport");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("Sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("Sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("Sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("Sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("Sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("Sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("Sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("Sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("Sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("Sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("Sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("Sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("Sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("Sender not between", value1, value2, "sender");
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