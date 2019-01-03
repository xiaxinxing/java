package spingclouddemo.MybatisFile.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VwtSquareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer oracleStart;

    protected Integer oracleEnd;

    public VwtSquareExample() {
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

    public void setOracleStart(Integer oracleStart) {
        this.oracleStart=oracleStart;
    }

    public Integer getOracleStart() {
        return oracleStart;
    }

    public void setOracleEnd(Integer oracleEnd) {
        this.oracleEnd=oracleEnd;
    }

    public Integer getOracleEnd() {
        return oracleEnd;
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUseversionIsNull() {
            addCriterion("USEVERSION is null");
            return (Criteria) this;
        }

        public Criteria andUseversionIsNotNull() {
            addCriterion("USEVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andUseversionEqualTo(String value) {
            addCriterion("USEVERSION =", value, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionNotEqualTo(String value) {
            addCriterion("USEVERSION <>", value, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionGreaterThan(String value) {
            addCriterion("USEVERSION >", value, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionGreaterThanOrEqualTo(String value) {
            addCriterion("USEVERSION >=", value, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionLessThan(String value) {
            addCriterion("USEVERSION <", value, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionLessThanOrEqualTo(String value) {
            addCriterion("USEVERSION <=", value, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionLike(String value) {
            addCriterion("USEVERSION like", value, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionNotLike(String value) {
            addCriterion("USEVERSION not like", value, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionIn(List<String> values) {
            addCriterion("USEVERSION in", values, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionNotIn(List<String> values) {
            addCriterion("USEVERSION not in", values, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionBetween(String value1, String value2) {
            addCriterion("USEVERSION between", value1, value2, "useversion");
            return (Criteria) this;
        }

        public Criteria andUseversionNotBetween(String value1, String value2) {
            addCriterion("USEVERSION not between", value1, value2, "useversion");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("LOGO is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("LOGO =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("LOGO <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("LOGO >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("LOGO <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("LOGO <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("LOGO like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("LOGO not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("LOGO in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("LOGO not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("LOGO between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("LOGO not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFtpurlIsNull() {
            addCriterion("FTPURL is null");
            return (Criteria) this;
        }

        public Criteria andFtpurlIsNotNull() {
            addCriterion("FTPURL is not null");
            return (Criteria) this;
        }

        public Criteria andFtpurlEqualTo(String value) {
            addCriterion("FTPURL =", value, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlNotEqualTo(String value) {
            addCriterion("FTPURL <>", value, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlGreaterThan(String value) {
            addCriterion("FTPURL >", value, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlGreaterThanOrEqualTo(String value) {
            addCriterion("FTPURL >=", value, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlLessThan(String value) {
            addCriterion("FTPURL <", value, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlLessThanOrEqualTo(String value) {
            addCriterion("FTPURL <=", value, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlLike(String value) {
            addCriterion("FTPURL like", value, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlNotLike(String value) {
            addCriterion("FTPURL not like", value, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlIn(List<String> values) {
            addCriterion("FTPURL in", values, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlNotIn(List<String> values) {
            addCriterion("FTPURL not in", values, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlBetween(String value1, String value2) {
            addCriterion("FTPURL between", value1, value2, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andFtpurlNotBetween(String value1, String value2) {
            addCriterion("FTPURL not between", value1, value2, "ftpurl");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andPublicimage1IsNull() {
            addCriterion("PUBLICIMAGE1 is null");
            return (Criteria) this;
        }

        public Criteria andPublicimage1IsNotNull() {
            addCriterion("PUBLICIMAGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andPublicimage1EqualTo(String value) {
            addCriterion("PUBLICIMAGE1 =", value, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1NotEqualTo(String value) {
            addCriterion("PUBLICIMAGE1 <>", value, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1GreaterThan(String value) {
            addCriterion("PUBLICIMAGE1 >", value, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1GreaterThanOrEqualTo(String value) {
            addCriterion("PUBLICIMAGE1 >=", value, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1LessThan(String value) {
            addCriterion("PUBLICIMAGE1 <", value, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1LessThanOrEqualTo(String value) {
            addCriterion("PUBLICIMAGE1 <=", value, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1Like(String value) {
            addCriterion("PUBLICIMAGE1 like", value, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1NotLike(String value) {
            addCriterion("PUBLICIMAGE1 not like", value, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1In(List<String> values) {
            addCriterion("PUBLICIMAGE1 in", values, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1NotIn(List<String> values) {
            addCriterion("PUBLICIMAGE1 not in", values, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1Between(String value1, String value2) {
            addCriterion("PUBLICIMAGE1 between", value1, value2, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage1NotBetween(String value1, String value2) {
            addCriterion("PUBLICIMAGE1 not between", value1, value2, "publicimage1");
            return (Criteria) this;
        }

        public Criteria andPublicimage2IsNull() {
            addCriterion("PUBLICIMAGE2 is null");
            return (Criteria) this;
        }

        public Criteria andPublicimage2IsNotNull() {
            addCriterion("PUBLICIMAGE2 is not null");
            return (Criteria) this;
        }

        public Criteria andPublicimage2EqualTo(String value) {
            addCriterion("PUBLICIMAGE2 =", value, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2NotEqualTo(String value) {
            addCriterion("PUBLICIMAGE2 <>", value, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2GreaterThan(String value) {
            addCriterion("PUBLICIMAGE2 >", value, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2GreaterThanOrEqualTo(String value) {
            addCriterion("PUBLICIMAGE2 >=", value, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2LessThan(String value) {
            addCriterion("PUBLICIMAGE2 <", value, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2LessThanOrEqualTo(String value) {
            addCriterion("PUBLICIMAGE2 <=", value, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2Like(String value) {
            addCriterion("PUBLICIMAGE2 like", value, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2NotLike(String value) {
            addCriterion("PUBLICIMAGE2 not like", value, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2In(List<String> values) {
            addCriterion("PUBLICIMAGE2 in", values, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2NotIn(List<String> values) {
            addCriterion("PUBLICIMAGE2 not in", values, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2Between(String value1, String value2) {
            addCriterion("PUBLICIMAGE2 between", value1, value2, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage2NotBetween(String value1, String value2) {
            addCriterion("PUBLICIMAGE2 not between", value1, value2, "publicimage2");
            return (Criteria) this;
        }

        public Criteria andPublicimage3IsNull() {
            addCriterion("PUBLICIMAGE3 is null");
            return (Criteria) this;
        }

        public Criteria andPublicimage3IsNotNull() {
            addCriterion("PUBLICIMAGE3 is not null");
            return (Criteria) this;
        }

        public Criteria andPublicimage3EqualTo(String value) {
            addCriterion("PUBLICIMAGE3 =", value, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3NotEqualTo(String value) {
            addCriterion("PUBLICIMAGE3 <>", value, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3GreaterThan(String value) {
            addCriterion("PUBLICIMAGE3 >", value, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3GreaterThanOrEqualTo(String value) {
            addCriterion("PUBLICIMAGE3 >=", value, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3LessThan(String value) {
            addCriterion("PUBLICIMAGE3 <", value, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3LessThanOrEqualTo(String value) {
            addCriterion("PUBLICIMAGE3 <=", value, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3Like(String value) {
            addCriterion("PUBLICIMAGE3 like", value, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3NotLike(String value) {
            addCriterion("PUBLICIMAGE3 not like", value, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3In(List<String> values) {
            addCriterion("PUBLICIMAGE3 in", values, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3NotIn(List<String> values) {
            addCriterion("PUBLICIMAGE3 not in", values, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3Between(String value1, String value2) {
            addCriterion("PUBLICIMAGE3 between", value1, value2, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage3NotBetween(String value1, String value2) {
            addCriterion("PUBLICIMAGE3 not between", value1, value2, "publicimage3");
            return (Criteria) this;
        }

        public Criteria andPublicimage4IsNull() {
            addCriterion("PUBLICIMAGE4 is null");
            return (Criteria) this;
        }

        public Criteria andPublicimage4IsNotNull() {
            addCriterion("PUBLICIMAGE4 is not null");
            return (Criteria) this;
        }

        public Criteria andPublicimage4EqualTo(String value) {
            addCriterion("PUBLICIMAGE4 =", value, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4NotEqualTo(String value) {
            addCriterion("PUBLICIMAGE4 <>", value, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4GreaterThan(String value) {
            addCriterion("PUBLICIMAGE4 >", value, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4GreaterThanOrEqualTo(String value) {
            addCriterion("PUBLICIMAGE4 >=", value, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4LessThan(String value) {
            addCriterion("PUBLICIMAGE4 <", value, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4LessThanOrEqualTo(String value) {
            addCriterion("PUBLICIMAGE4 <=", value, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4Like(String value) {
            addCriterion("PUBLICIMAGE4 like", value, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4NotLike(String value) {
            addCriterion("PUBLICIMAGE4 not like", value, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4In(List<String> values) {
            addCriterion("PUBLICIMAGE4 in", values, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4NotIn(List<String> values) {
            addCriterion("PUBLICIMAGE4 not in", values, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4Between(String value1, String value2) {
            addCriterion("PUBLICIMAGE4 between", value1, value2, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andPublicimage4NotBetween(String value1, String value2) {
            addCriterion("PUBLICIMAGE4 not between", value1, value2, "publicimage4");
            return (Criteria) this;
        }

        public Criteria andIshideIsNull() {
            addCriterion("ISHIDE is null");
            return (Criteria) this;
        }

        public Criteria andIshideIsNotNull() {
            addCriterion("ISHIDE is not null");
            return (Criteria) this;
        }

        public Criteria andIshideEqualTo(Short value) {
            addCriterion("ISHIDE =", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotEqualTo(Short value) {
            addCriterion("ISHIDE <>", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideGreaterThan(Short value) {
            addCriterion("ISHIDE >", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideGreaterThanOrEqualTo(Short value) {
            addCriterion("ISHIDE >=", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideLessThan(Short value) {
            addCriterion("ISHIDE <", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideLessThanOrEqualTo(Short value) {
            addCriterion("ISHIDE <=", value, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideIn(List<Short> values) {
            addCriterion("ISHIDE in", values, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotIn(List<Short> values) {
            addCriterion("ISHIDE not in", values, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideBetween(Short value1, Short value2) {
            addCriterion("ISHIDE between", value1, value2, "ishide");
            return (Criteria) this;
        }

        public Criteria andIshideNotBetween(Short value1, Short value2) {
            addCriterion("ISHIDE not between", value1, value2, "ishide");
            return (Criteria) this;
        }

        public Criteria andPresetIsNull() {
            addCriterion("PRESET is null");
            return (Criteria) this;
        }

        public Criteria andPresetIsNotNull() {
            addCriterion("PRESET is not null");
            return (Criteria) this;
        }

        public Criteria andPresetEqualTo(Short value) {
            addCriterion("PRESET =", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetNotEqualTo(Short value) {
            addCriterion("PRESET <>", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetGreaterThan(Short value) {
            addCriterion("PRESET >", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetGreaterThanOrEqualTo(Short value) {
            addCriterion("PRESET >=", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetLessThan(Short value) {
            addCriterion("PRESET <", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetLessThanOrEqualTo(Short value) {
            addCriterion("PRESET <=", value, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetIn(List<Short> values) {
            addCriterion("PRESET in", values, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetNotIn(List<Short> values) {
            addCriterion("PRESET not in", values, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetBetween(Short value1, Short value2) {
            addCriterion("PRESET between", value1, value2, "preset");
            return (Criteria) this;
        }

        public Criteria andPresetNotBetween(Short value1, Short value2) {
            addCriterion("PRESET not between", value1, value2, "preset");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Long value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Long value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Long value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Long value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Long value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Long value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Long> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Long> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Long value1, Long value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Long value1, Long value2) {
            addCriterion("SORT not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andCorpidIsNull() {
            addCriterion("CORPID is null");
            return (Criteria) this;
        }

        public Criteria andCorpidIsNotNull() {
            addCriterion("CORPID is not null");
            return (Criteria) this;
        }

        public Criteria andCorpidEqualTo(String value) {
            addCriterion("CORPID =", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotEqualTo(String value) {
            addCriterion("CORPID <>", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidGreaterThan(String value) {
            addCriterion("CORPID >", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidGreaterThanOrEqualTo(String value) {
            addCriterion("CORPID >=", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLessThan(String value) {
            addCriterion("CORPID <", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLessThanOrEqualTo(String value) {
            addCriterion("CORPID <=", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidLike(String value) {
            addCriterion("CORPID like", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotLike(String value) {
            addCriterion("CORPID not like", value, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidIn(List<String> values) {
            addCriterion("CORPID in", values, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotIn(List<String> values) {
            addCriterion("CORPID not in", values, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidBetween(String value1, String value2) {
            addCriterion("CORPID between", value1, value2, "corpid");
            return (Criteria) this;
        }

        public Criteria andCorpidNotBetween(String value1, String value2) {
            addCriterion("CORPID not between", value1, value2, "corpid");
            return (Criteria) this;
        }

        public Criteria andSecurityidIsNull() {
            addCriterion("SECURITYID is null");
            return (Criteria) this;
        }

        public Criteria andSecurityidIsNotNull() {
            addCriterion("SECURITYID is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityidEqualTo(String value) {
            addCriterion("SECURITYID =", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidNotEqualTo(String value) {
            addCriterion("SECURITYID <>", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidGreaterThan(String value) {
            addCriterion("SECURITYID >", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITYID >=", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidLessThan(String value) {
            addCriterion("SECURITYID <", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidLessThanOrEqualTo(String value) {
            addCriterion("SECURITYID <=", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidLike(String value) {
            addCriterion("SECURITYID like", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidNotLike(String value) {
            addCriterion("SECURITYID not like", value, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidIn(List<String> values) {
            addCriterion("SECURITYID in", values, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidNotIn(List<String> values) {
            addCriterion("SECURITYID not in", values, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidBetween(String value1, String value2) {
            addCriterion("SECURITYID between", value1, value2, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecurityidNotBetween(String value1, String value2) {
            addCriterion("SECURITYID not between", value1, value2, "securityid");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyIsNull() {
            addCriterion("SECURITYKEY is null");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyIsNotNull() {
            addCriterion("SECURITYKEY is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyEqualTo(String value) {
            addCriterion("SECURITYKEY =", value, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyNotEqualTo(String value) {
            addCriterion("SECURITYKEY <>", value, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyGreaterThan(String value) {
            addCriterion("SECURITYKEY >", value, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITYKEY >=", value, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyLessThan(String value) {
            addCriterion("SECURITYKEY <", value, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyLessThanOrEqualTo(String value) {
            addCriterion("SECURITYKEY <=", value, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyLike(String value) {
            addCriterion("SECURITYKEY like", value, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyNotLike(String value) {
            addCriterion("SECURITYKEY not like", value, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyIn(List<String> values) {
            addCriterion("SECURITYKEY in", values, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyNotIn(List<String> values) {
            addCriterion("SECURITYKEY not in", values, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyBetween(String value1, String value2) {
            addCriterion("SECURITYKEY between", value1, value2, "securitykey");
            return (Criteria) this;
        }

        public Criteria andSecuritykeyNotBetween(String value1, String value2) {
            addCriterion("SECURITYKEY not between", value1, value2, "securitykey");
            return (Criteria) this;
        }

        public Criteria andCallbackurlIsNull() {
            addCriterion("CALLBACKURL is null");
            return (Criteria) this;
        }

        public Criteria andCallbackurlIsNotNull() {
            addCriterion("CALLBACKURL is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackurlEqualTo(String value) {
            addCriterion("CALLBACKURL =", value, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlNotEqualTo(String value) {
            addCriterion("CALLBACKURL <>", value, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlGreaterThan(String value) {
            addCriterion("CALLBACKURL >", value, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlGreaterThanOrEqualTo(String value) {
            addCriterion("CALLBACKURL >=", value, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlLessThan(String value) {
            addCriterion("CALLBACKURL <", value, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlLessThanOrEqualTo(String value) {
            addCriterion("CALLBACKURL <=", value, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlLike(String value) {
            addCriterion("CALLBACKURL like", value, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlNotLike(String value) {
            addCriterion("CALLBACKURL not like", value, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlIn(List<String> values) {
            addCriterion("CALLBACKURL in", values, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlNotIn(List<String> values) {
            addCriterion("CALLBACKURL not in", values, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlBetween(String value1, String value2) {
            addCriterion("CALLBACKURL between", value1, value2, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andCallbackurlNotBetween(String value1, String value2) {
            addCriterion("CALLBACKURL not between", value1, value2, "callbackurl");
            return (Criteria) this;
        }

        public Criteria andServicenotypeIsNull() {
            addCriterion("SERVICENOTYPE is null");
            return (Criteria) this;
        }

        public Criteria andServicenotypeIsNotNull() {
            addCriterion("SERVICENOTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andServicenotypeEqualTo(String value) {
            addCriterion("SERVICENOTYPE =", value, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeNotEqualTo(String value) {
            addCriterion("SERVICENOTYPE <>", value, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeGreaterThan(String value) {
            addCriterion("SERVICENOTYPE >", value, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICENOTYPE >=", value, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeLessThan(String value) {
            addCriterion("SERVICENOTYPE <", value, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeLessThanOrEqualTo(String value) {
            addCriterion("SERVICENOTYPE <=", value, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeLike(String value) {
            addCriterion("SERVICENOTYPE like", value, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeNotLike(String value) {
            addCriterion("SERVICENOTYPE not like", value, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeIn(List<String> values) {
            addCriterion("SERVICENOTYPE in", values, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeNotIn(List<String> values) {
            addCriterion("SERVICENOTYPE not in", values, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeBetween(String value1, String value2) {
            addCriterion("SERVICENOTYPE between", value1, value2, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andServicenotypeNotBetween(String value1, String value2) {
            addCriterion("SERVICENOTYPE not between", value1, value2, "servicenotype");
            return (Criteria) this;
        }

        public Criteria andSizesIsNull() {
            addCriterion("SIZES is null");
            return (Criteria) this;
        }

        public Criteria andSizesIsNotNull() {
            addCriterion("SIZES is not null");
            return (Criteria) this;
        }

        public Criteria andSizesEqualTo(Long value) {
            addCriterion("SIZES =", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotEqualTo(Long value) {
            addCriterion("SIZES <>", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesGreaterThan(Long value) {
            addCriterion("SIZES >", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesGreaterThanOrEqualTo(Long value) {
            addCriterion("SIZES >=", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesLessThan(Long value) {
            addCriterion("SIZES <", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesLessThanOrEqualTo(Long value) {
            addCriterion("SIZES <=", value, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesIn(List<Long> values) {
            addCriterion("SIZES in", values, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotIn(List<Long> values) {
            addCriterion("SIZES not in", values, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesBetween(Long value1, Long value2) {
            addCriterion("SIZES between", value1, value2, "sizes");
            return (Criteria) this;
        }

        public Criteria andSizesNotBetween(Long value1, Long value2) {
            addCriterion("SIZES not between", value1, value2, "sizes");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andPackagenameIsNull() {
            addCriterion("PACKAGENAME is null");
            return (Criteria) this;
        }

        public Criteria andPackagenameIsNotNull() {
            addCriterion("PACKAGENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPackagenameEqualTo(String value) {
            addCriterion("PACKAGENAME =", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotEqualTo(String value) {
            addCriterion("PACKAGENAME <>", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameGreaterThan(String value) {
            addCriterion("PACKAGENAME >", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGENAME >=", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLessThan(String value) {
            addCriterion("PACKAGENAME <", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLessThanOrEqualTo(String value) {
            addCriterion("PACKAGENAME <=", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLike(String value) {
            addCriterion("PACKAGENAME like", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotLike(String value) {
            addCriterion("PACKAGENAME not like", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameIn(List<String> values) {
            addCriterion("PACKAGENAME in", values, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotIn(List<String> values) {
            addCriterion("PACKAGENAME not in", values, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameBetween(String value1, String value2) {
            addCriterion("PACKAGENAME between", value1, value2, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotBetween(String value1, String value2) {
            addCriterion("PACKAGENAME not between", value1, value2, "packagename");
            return (Criteria) this;
        }

        public Criteria andVersioncodeIsNull() {
            addCriterion("VERSIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andVersioncodeIsNotNull() {
            addCriterion("VERSIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andVersioncodeEqualTo(String value) {
            addCriterion("VERSIONCODE =", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotEqualTo(String value) {
            addCriterion("VERSIONCODE <>", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeGreaterThan(String value) {
            addCriterion("VERSIONCODE >", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("VERSIONCODE >=", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeLessThan(String value) {
            addCriterion("VERSIONCODE <", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeLessThanOrEqualTo(String value) {
            addCriterion("VERSIONCODE <=", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeLike(String value) {
            addCriterion("VERSIONCODE like", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotLike(String value) {
            addCriterion("VERSIONCODE not like", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeIn(List<String> values) {
            addCriterion("VERSIONCODE in", values, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotIn(List<String> values) {
            addCriterion("VERSIONCODE not in", values, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeBetween(String value1, String value2) {
            addCriterion("VERSIONCODE between", value1, value2, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotBetween(String value1, String value2) {
            addCriterion("VERSIONCODE not between", value1, value2, "versioncode");
            return (Criteria) this;
        }

        public Criteria andIsopenallIsNull() {
            addCriterion("ISOPENALL is null");
            return (Criteria) this;
        }

        public Criteria andIsopenallIsNotNull() {
            addCriterion("ISOPENALL is not null");
            return (Criteria) this;
        }

        public Criteria andIsopenallEqualTo(Short value) {
            addCriterion("ISOPENALL =", value, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIsopenallNotEqualTo(Short value) {
            addCriterion("ISOPENALL <>", value, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIsopenallGreaterThan(Short value) {
            addCriterion("ISOPENALL >", value, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIsopenallGreaterThanOrEqualTo(Short value) {
            addCriterion("ISOPENALL >=", value, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIsopenallLessThan(Short value) {
            addCriterion("ISOPENALL <", value, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIsopenallLessThanOrEqualTo(Short value) {
            addCriterion("ISOPENALL <=", value, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIsopenallIn(List<Short> values) {
            addCriterion("ISOPENALL in", values, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIsopenallNotIn(List<Short> values) {
            addCriterion("ISOPENALL not in", values, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIsopenallBetween(Short value1, Short value2) {
            addCriterion("ISOPENALL between", value1, value2, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIsopenallNotBetween(Short value1, Short value2) {
            addCriterion("ISOPENALL not between", value1, value2, "isopenall");
            return (Criteria) this;
        }

        public Criteria andIssystemappIsNull() {
            addCriterion("ISSYSTEMAPP is null");
            return (Criteria) this;
        }

        public Criteria andIssystemappIsNotNull() {
            addCriterion("ISSYSTEMAPP is not null");
            return (Criteria) this;
        }

        public Criteria andIssystemappEqualTo(Short value) {
            addCriterion("ISSYSTEMAPP =", value, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andIssystemappNotEqualTo(Short value) {
            addCriterion("ISSYSTEMAPP <>", value, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andIssystemappGreaterThan(Short value) {
            addCriterion("ISSYSTEMAPP >", value, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andIssystemappGreaterThanOrEqualTo(Short value) {
            addCriterion("ISSYSTEMAPP >=", value, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andIssystemappLessThan(Short value) {
            addCriterion("ISSYSTEMAPP <", value, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andIssystemappLessThanOrEqualTo(Short value) {
            addCriterion("ISSYSTEMAPP <=", value, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andIssystemappIn(List<Short> values) {
            addCriterion("ISSYSTEMAPP in", values, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andIssystemappNotIn(List<Short> values) {
            addCriterion("ISSYSTEMAPP not in", values, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andIssystemappBetween(Short value1, Short value2) {
            addCriterion("ISSYSTEMAPP between", value1, value2, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andIssystemappNotBetween(Short value1, Short value2) {
            addCriterion("ISSYSTEMAPP not between", value1, value2, "issystemapp");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNull() {
            addCriterion("REGIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andRegionnameIsNotNull() {
            addCriterion("REGIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegionnameEqualTo(String value) {
            addCriterion("REGIONNAME =", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotEqualTo(String value) {
            addCriterion("REGIONNAME <>", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThan(String value) {
            addCriterion("REGIONNAME >", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameGreaterThanOrEqualTo(String value) {
            addCriterion("REGIONNAME >=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThan(String value) {
            addCriterion("REGIONNAME <", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLessThanOrEqualTo(String value) {
            addCriterion("REGIONNAME <=", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameLike(String value) {
            addCriterion("REGIONNAME like", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotLike(String value) {
            addCriterion("REGIONNAME not like", value, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameIn(List<String> values) {
            addCriterion("REGIONNAME in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotIn(List<String> values) {
            addCriterion("REGIONNAME not in", values, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameBetween(String value1, String value2) {
            addCriterion("REGIONNAME between", value1, value2, "regionname");
            return (Criteria) this;
        }

        public Criteria andRegionnameNotBetween(String value1, String value2) {
            addCriterion("REGIONNAME not between", value1, value2, "regionname");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginIsNull() {
            addCriterion("ISFREELOGIN is null");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginIsNotNull() {
            addCriterion("ISFREELOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginEqualTo(Short value) {
            addCriterion("ISFREELOGIN =", value, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginNotEqualTo(Short value) {
            addCriterion("ISFREELOGIN <>", value, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginGreaterThan(Short value) {
            addCriterion("ISFREELOGIN >", value, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginGreaterThanOrEqualTo(Short value) {
            addCriterion("ISFREELOGIN >=", value, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginLessThan(Short value) {
            addCriterion("ISFREELOGIN <", value, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginLessThanOrEqualTo(Short value) {
            addCriterion("ISFREELOGIN <=", value, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginIn(List<Short> values) {
            addCriterion("ISFREELOGIN in", values, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginNotIn(List<Short> values) {
            addCriterion("ISFREELOGIN not in", values, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginBetween(Short value1, Short value2) {
            addCriterion("ISFREELOGIN between", value1, value2, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andIsfreeloginNotBetween(Short value1, Short value2) {
            addCriterion("ISFREELOGIN not between", value1, value2, "isfreelogin");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("TOKEN =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("TOKEN >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("TOKEN <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("TOKEN like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("TOKEN not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("TOKEN in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenurlIsNull() {
            addCriterion("TOKENURL is null");
            return (Criteria) this;
        }

        public Criteria andTokenurlIsNotNull() {
            addCriterion("TOKENURL is not null");
            return (Criteria) this;
        }

        public Criteria andTokenurlEqualTo(String value) {
            addCriterion("TOKENURL =", value, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlNotEqualTo(String value) {
            addCriterion("TOKENURL <>", value, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlGreaterThan(String value) {
            addCriterion("TOKENURL >", value, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlGreaterThanOrEqualTo(String value) {
            addCriterion("TOKENURL >=", value, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlLessThan(String value) {
            addCriterion("TOKENURL <", value, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlLessThanOrEqualTo(String value) {
            addCriterion("TOKENURL <=", value, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlLike(String value) {
            addCriterion("TOKENURL like", value, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlNotLike(String value) {
            addCriterion("TOKENURL not like", value, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlIn(List<String> values) {
            addCriterion("TOKENURL in", values, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlNotIn(List<String> values) {
            addCriterion("TOKENURL not in", values, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlBetween(String value1, String value2) {
            addCriterion("TOKENURL between", value1, value2, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andTokenurlNotBetween(String value1, String value2) {
            addCriterion("TOKENURL not between", value1, value2, "tokenurl");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionIsNull() {
            addCriterion("ISCANCELATTENTION is null");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionIsNotNull() {
            addCriterion("ISCANCELATTENTION is not null");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionEqualTo(Short value) {
            addCriterion("ISCANCELATTENTION =", value, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionNotEqualTo(Short value) {
            addCriterion("ISCANCELATTENTION <>", value, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionGreaterThan(Short value) {
            addCriterion("ISCANCELATTENTION >", value, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionGreaterThanOrEqualTo(Short value) {
            addCriterion("ISCANCELATTENTION >=", value, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionLessThan(Short value) {
            addCriterion("ISCANCELATTENTION <", value, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionLessThanOrEqualTo(Short value) {
            addCriterion("ISCANCELATTENTION <=", value, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionIn(List<Short> values) {
            addCriterion("ISCANCELATTENTION in", values, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionNotIn(List<Short> values) {
            addCriterion("ISCANCELATTENTION not in", values, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionBetween(Short value1, Short value2) {
            addCriterion("ISCANCELATTENTION between", value1, value2, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andIscancelattentionNotBetween(Short value1, Short value2) {
            addCriterion("ISCANCELATTENTION not between", value1, value2, "iscancelattention");
            return (Criteria) this;
        }

        public Criteria andStartparameterIsNull() {
            addCriterion("STARTPARAMETER is null");
            return (Criteria) this;
        }

        public Criteria andStartparameterIsNotNull() {
            addCriterion("STARTPARAMETER is not null");
            return (Criteria) this;
        }

        public Criteria andStartparameterEqualTo(String value) {
            addCriterion("STARTPARAMETER =", value, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterNotEqualTo(String value) {
            addCriterion("STARTPARAMETER <>", value, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterGreaterThan(String value) {
            addCriterion("STARTPARAMETER >", value, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterGreaterThanOrEqualTo(String value) {
            addCriterion("STARTPARAMETER >=", value, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterLessThan(String value) {
            addCriterion("STARTPARAMETER <", value, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterLessThanOrEqualTo(String value) {
            addCriterion("STARTPARAMETER <=", value, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterLike(String value) {
            addCriterion("STARTPARAMETER like", value, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterNotLike(String value) {
            addCriterion("STARTPARAMETER not like", value, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterIn(List<String> values) {
            addCriterion("STARTPARAMETER in", values, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterNotIn(List<String> values) {
            addCriterion("STARTPARAMETER not in", values, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterBetween(String value1, String value2) {
            addCriterion("STARTPARAMETER between", value1, value2, "startparameter");
            return (Criteria) this;
        }

        public Criteria andStartparameterNotBetween(String value1, String value2) {
            addCriterion("STARTPARAMETER not between", value1, value2, "startparameter");
            return (Criteria) this;
        }

        public Criteria andServicenomenuIsNull() {
            addCriterion("SERVICENOMENU is null");
            return (Criteria) this;
        }

        public Criteria andServicenomenuIsNotNull() {
            addCriterion("SERVICENOMENU is not null");
            return (Criteria) this;
        }

        public Criteria andServicenomenuEqualTo(Short value) {
            addCriterion("SERVICENOMENU =", value, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andServicenomenuNotEqualTo(Short value) {
            addCriterion("SERVICENOMENU <>", value, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andServicenomenuGreaterThan(Short value) {
            addCriterion("SERVICENOMENU >", value, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andServicenomenuGreaterThanOrEqualTo(Short value) {
            addCriterion("SERVICENOMENU >=", value, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andServicenomenuLessThan(Short value) {
            addCriterion("SERVICENOMENU <", value, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andServicenomenuLessThanOrEqualTo(Short value) {
            addCriterion("SERVICENOMENU <=", value, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andServicenomenuIn(List<Short> values) {
            addCriterion("SERVICENOMENU in", values, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andServicenomenuNotIn(List<Short> values) {
            addCriterion("SERVICENOMENU not in", values, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andServicenomenuBetween(Short value1, Short value2) {
            addCriterion("SERVICENOMENU between", value1, value2, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andServicenomenuNotBetween(Short value1, Short value2) {
            addCriterion("SERVICENOMENU not between", value1, value2, "servicenomenu");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNull() {
            addCriterion("TELNUM is null");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNotNull() {
            addCriterion("TELNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumEqualTo(Short value) {
            addCriterion("TELNUM =", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotEqualTo(Short value) {
            addCriterion("TELNUM <>", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThan(Short value) {
            addCriterion("TELNUM >", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThanOrEqualTo(Short value) {
            addCriterion("TELNUM >=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThan(Short value) {
            addCriterion("TELNUM <", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThanOrEqualTo(Short value) {
            addCriterion("TELNUM <=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumIn(List<Short> values) {
            addCriterion("TELNUM in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotIn(List<Short> values) {
            addCriterion("TELNUM not in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumBetween(Short value1, Short value2) {
            addCriterion("TELNUM between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotBetween(Short value1, Short value2) {
            addCriterion("TELNUM not between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Short value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Short value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Short value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Short value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Short value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Short value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Short> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Short> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Short value1, Short value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Short value1, Short value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andChannelnumIsNull() {
            addCriterion("CHANNELNUM is null");
            return (Criteria) this;
        }

        public Criteria andChannelnumIsNotNull() {
            addCriterion("CHANNELNUM is not null");
            return (Criteria) this;
        }

        public Criteria andChannelnumEqualTo(Short value) {
            addCriterion("CHANNELNUM =", value, "channelnum");
            return (Criteria) this;
        }

        public Criteria andChannelnumNotEqualTo(Short value) {
            addCriterion("CHANNELNUM <>", value, "channelnum");
            return (Criteria) this;
        }

        public Criteria andChannelnumGreaterThan(Short value) {
            addCriterion("CHANNELNUM >", value, "channelnum");
            return (Criteria) this;
        }

        public Criteria andChannelnumGreaterThanOrEqualTo(Short value) {
            addCriterion("CHANNELNUM >=", value, "channelnum");
            return (Criteria) this;
        }

        public Criteria andChannelnumLessThan(Short value) {
            addCriterion("CHANNELNUM <", value, "channelnum");
            return (Criteria) this;
        }

        public Criteria andChannelnumLessThanOrEqualTo(Short value) {
            addCriterion("CHANNELNUM <=", value, "channelnum");
            return (Criteria) this;
        }

        public Criteria andChannelnumIn(List<Short> values) {
            addCriterion("CHANNELNUM in", values, "channelnum");
            return (Criteria) this;
        }

        public Criteria andChannelnumNotIn(List<Short> values) {
            addCriterion("CHANNELNUM not in", values, "channelnum");
            return (Criteria) this;
        }

        public Criteria andChannelnumBetween(Short value1, Short value2) {
            addCriterion("CHANNELNUM between", value1, value2, "channelnum");
            return (Criteria) this;
        }

        public Criteria andChannelnumNotBetween(Short value1, Short value2) {
            addCriterion("CHANNELNUM not between", value1, value2, "channelnum");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchIsNull() {
            addCriterion("SHOWWORKBENCH is null");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchIsNotNull() {
            addCriterion("SHOWWORKBENCH is not null");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchEqualTo(Short value) {
            addCriterion("SHOWWORKBENCH =", value, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchNotEqualTo(Short value) {
            addCriterion("SHOWWORKBENCH <>", value, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchGreaterThan(Short value) {
            addCriterion("SHOWWORKBENCH >", value, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchGreaterThanOrEqualTo(Short value) {
            addCriterion("SHOWWORKBENCH >=", value, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchLessThan(Short value) {
            addCriterion("SHOWWORKBENCH <", value, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchLessThanOrEqualTo(Short value) {
            addCriterion("SHOWWORKBENCH <=", value, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchIn(List<Short> values) {
            addCriterion("SHOWWORKBENCH in", values, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchNotIn(List<Short> values) {
            addCriterion("SHOWWORKBENCH not in", values, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchBetween(Short value1, Short value2) {
            addCriterion("SHOWWORKBENCH between", value1, value2, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andShowworkbenchNotBetween(Short value1, Short value2) {
            addCriterion("SHOWWORKBENCH not between", value1, value2, "showworkbench");
            return (Criteria) this;
        }

        public Criteria andFromchannelIsNull() {
            addCriterion("FROMCHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andFromchannelIsNotNull() {
            addCriterion("FROMCHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andFromchannelEqualTo(Short value) {
            addCriterion("FROMCHANNEL =", value, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andFromchannelNotEqualTo(Short value) {
            addCriterion("FROMCHANNEL <>", value, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andFromchannelGreaterThan(Short value) {
            addCriterion("FROMCHANNEL >", value, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andFromchannelGreaterThanOrEqualTo(Short value) {
            addCriterion("FROMCHANNEL >=", value, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andFromchannelLessThan(Short value) {
            addCriterion("FROMCHANNEL <", value, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andFromchannelLessThanOrEqualTo(Short value) {
            addCriterion("FROMCHANNEL <=", value, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andFromchannelIn(List<Short> values) {
            addCriterion("FROMCHANNEL in", values, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andFromchannelNotIn(List<Short> values) {
            addCriterion("FROMCHANNEL not in", values, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andFromchannelBetween(Short value1, Short value2) {
            addCriterion("FROMCHANNEL between", value1, value2, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andFromchannelNotBetween(Short value1, Short value2) {
            addCriterion("FROMCHANNEL not between", value1, value2, "fromchannel");
            return (Criteria) this;
        }

        public Criteria andIstestneededIsNull() {
            addCriterion("ISTESTNEEDED is null");
            return (Criteria) this;
        }

        public Criteria andIstestneededIsNotNull() {
            addCriterion("ISTESTNEEDED is not null");
            return (Criteria) this;
        }

        public Criteria andIstestneededEqualTo(BigDecimal value) {
            addCriterion("ISTESTNEEDED =", value, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andIstestneededNotEqualTo(BigDecimal value) {
            addCriterion("ISTESTNEEDED <>", value, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andIstestneededGreaterThan(BigDecimal value) {
            addCriterion("ISTESTNEEDED >", value, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andIstestneededGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISTESTNEEDED >=", value, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andIstestneededLessThan(BigDecimal value) {
            addCriterion("ISTESTNEEDED <", value, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andIstestneededLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISTESTNEEDED <=", value, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andIstestneededIn(List<BigDecimal> values) {
            addCriterion("ISTESTNEEDED in", values, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andIstestneededNotIn(List<BigDecimal> values) {
            addCriterion("ISTESTNEEDED not in", values, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andIstestneededBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISTESTNEEDED between", value1, value2, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andIstestneededNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISTESTNEEDED not between", value1, value2, "istestneeded");
            return (Criteria) this;
        }

        public Criteria andPubreasonIsNull() {
            addCriterion("PUBREASON is null");
            return (Criteria) this;
        }

        public Criteria andPubreasonIsNotNull() {
            addCriterion("PUBREASON is not null");
            return (Criteria) this;
        }

        public Criteria andPubreasonEqualTo(String value) {
            addCriterion("PUBREASON =", value, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonNotEqualTo(String value) {
            addCriterion("PUBREASON <>", value, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonGreaterThan(String value) {
            addCriterion("PUBREASON >", value, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonGreaterThanOrEqualTo(String value) {
            addCriterion("PUBREASON >=", value, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonLessThan(String value) {
            addCriterion("PUBREASON <", value, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonLessThanOrEqualTo(String value) {
            addCriterion("PUBREASON <=", value, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonLike(String value) {
            addCriterion("PUBREASON like", value, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonNotLike(String value) {
            addCriterion("PUBREASON not like", value, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonIn(List<String> values) {
            addCriterion("PUBREASON in", values, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonNotIn(List<String> values) {
            addCriterion("PUBREASON not in", values, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonBetween(String value1, String value2) {
            addCriterion("PUBREASON between", value1, value2, "pubreason");
            return (Criteria) this;
        }

        public Criteria andPubreasonNotBetween(String value1, String value2) {
            addCriterion("PUBREASON not between", value1, value2, "pubreason");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNull() {
            addCriterion("APPLYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNotNull() {
            addCriterion("APPLYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypeEqualTo(Short value) {
            addCriterion("APPLYTYPE =", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotEqualTo(Short value) {
            addCriterion("APPLYTYPE <>", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThan(Short value) {
            addCriterion("APPLYTYPE >", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThanOrEqualTo(Short value) {
            addCriterion("APPLYTYPE >=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThan(Short value) {
            addCriterion("APPLYTYPE <", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThanOrEqualTo(Short value) {
            addCriterion("APPLYTYPE <=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeIn(List<Short> values) {
            addCriterion("APPLYTYPE in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotIn(List<Short> values) {
            addCriterion("APPLYTYPE not in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeBetween(Short value1, Short value2) {
            addCriterion("APPLYTYPE between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotBetween(Short value1, Short value2) {
            addCriterion("APPLYTYPE not between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyIsNull() {
            addCriterion("ENCODING_AES_KEY is null");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyIsNotNull() {
            addCriterion("ENCODING_AES_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyEqualTo(String value) {
            addCriterion("ENCODING_AES_KEY =", value, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyNotEqualTo(String value) {
            addCriterion("ENCODING_AES_KEY <>", value, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyGreaterThan(String value) {
            addCriterion("ENCODING_AES_KEY >", value, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ENCODING_AES_KEY >=", value, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyLessThan(String value) {
            addCriterion("ENCODING_AES_KEY <", value, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyLessThanOrEqualTo(String value) {
            addCriterion("ENCODING_AES_KEY <=", value, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyLike(String value) {
            addCriterion("ENCODING_AES_KEY like", value, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyNotLike(String value) {
            addCriterion("ENCODING_AES_KEY not like", value, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyIn(List<String> values) {
            addCriterion("ENCODING_AES_KEY in", values, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyNotIn(List<String> values) {
            addCriterion("ENCODING_AES_KEY not in", values, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyBetween(String value1, String value2) {
            addCriterion("ENCODING_AES_KEY between", value1, value2, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andEncodingAesKeyNotBetween(String value1, String value2) {
            addCriterion("ENCODING_AES_KEY not between", value1, value2, "encodingAesKey");
            return (Criteria) this;
        }

        public Criteria andSize1IsNull() {
            addCriterion("SIZE1 is null");
            return (Criteria) this;
        }

        public Criteria andSize1IsNotNull() {
            addCriterion("SIZE1 is not null");
            return (Criteria) this;
        }

        public Criteria andSize1EqualTo(BigDecimal value) {
            addCriterion("SIZE1 =", value, "size1");
            return (Criteria) this;
        }

        public Criteria andSize1NotEqualTo(BigDecimal value) {
            addCriterion("SIZE1 <>", value, "size1");
            return (Criteria) this;
        }

        public Criteria andSize1GreaterThan(BigDecimal value) {
            addCriterion("SIZE1 >", value, "size1");
            return (Criteria) this;
        }

        public Criteria andSize1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE1 >=", value, "size1");
            return (Criteria) this;
        }

        public Criteria andSize1LessThan(BigDecimal value) {
            addCriterion("SIZE1 <", value, "size1");
            return (Criteria) this;
        }

        public Criteria andSize1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE1 <=", value, "size1");
            return (Criteria) this;
        }

        public Criteria andSize1In(List<BigDecimal> values) {
            addCriterion("SIZE1 in", values, "size1");
            return (Criteria) this;
        }

        public Criteria andSize1NotIn(List<BigDecimal> values) {
            addCriterion("SIZE1 not in", values, "size1");
            return (Criteria) this;
        }

        public Criteria andSize1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE1 between", value1, value2, "size1");
            return (Criteria) this;
        }

        public Criteria andSize1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE1 not between", value1, value2, "size1");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("PUBLISHTIME is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("PUBLISHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterion("PUBLISHTIME =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterion("PUBLISHTIME <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterion("PUBLISHTIME >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PUBLISHTIME >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterion("PUBLISHTIME <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("PUBLISHTIME <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterion("PUBLISHTIME in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterion("PUBLISHTIME not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterion("PUBLISHTIME between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("PUBLISHTIME not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPersonalizeIsNull() {
            addCriterion("PERSONALIZE is null");
            return (Criteria) this;
        }

        public Criteria andPersonalizeIsNotNull() {
            addCriterion("PERSONALIZE is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalizeEqualTo(String value) {
            addCriterion("PERSONALIZE =", value, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeNotEqualTo(String value) {
            addCriterion("PERSONALIZE <>", value, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeGreaterThan(String value) {
            addCriterion("PERSONALIZE >", value, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONALIZE >=", value, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeLessThan(String value) {
            addCriterion("PERSONALIZE <", value, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeLessThanOrEqualTo(String value) {
            addCriterion("PERSONALIZE <=", value, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeLike(String value) {
            addCriterion("PERSONALIZE like", value, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeNotLike(String value) {
            addCriterion("PERSONALIZE not like", value, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeIn(List<String> values) {
            addCriterion("PERSONALIZE in", values, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeNotIn(List<String> values) {
            addCriterion("PERSONALIZE not in", values, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeBetween(String value1, String value2) {
            addCriterion("PERSONALIZE between", value1, value2, "personalize");
            return (Criteria) this;
        }

        public Criteria andPersonalizeNotBetween(String value1, String value2) {
            addCriterion("PERSONALIZE not between", value1, value2, "personalize");
            return (Criteria) this;
        }

        public Criteria andSelcorpidIsNull() {
            addCriterion("SELCORPID is null");
            return (Criteria) this;
        }

        public Criteria andSelcorpidIsNotNull() {
            addCriterion("SELCORPID is not null");
            return (Criteria) this;
        }

        public Criteria andSelcorpidEqualTo(String value) {
            addCriterion("SELCORPID =", value, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidNotEqualTo(String value) {
            addCriterion("SELCORPID <>", value, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidGreaterThan(String value) {
            addCriterion("SELCORPID >", value, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidGreaterThanOrEqualTo(String value) {
            addCriterion("SELCORPID >=", value, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidLessThan(String value) {
            addCriterion("SELCORPID <", value, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidLessThanOrEqualTo(String value) {
            addCriterion("SELCORPID <=", value, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidLike(String value) {
            addCriterion("SELCORPID like", value, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidNotLike(String value) {
            addCriterion("SELCORPID not like", value, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidIn(List<String> values) {
            addCriterion("SELCORPID in", values, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidNotIn(List<String> values) {
            addCriterion("SELCORPID not in", values, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidBetween(String value1, String value2) {
            addCriterion("SELCORPID between", value1, value2, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andSelcorpidNotBetween(String value1, String value2) {
            addCriterion("SELCORPID not between", value1, value2, "selcorpid");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlIsNull() {
            addCriterion("PLATFORM_URL is null");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlIsNotNull() {
            addCriterion("PLATFORM_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlEqualTo(String value) {
            addCriterion("PLATFORM_URL =", value, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlNotEqualTo(String value) {
            addCriterion("PLATFORM_URL <>", value, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlGreaterThan(String value) {
            addCriterion("PLATFORM_URL >", value, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM_URL >=", value, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlLessThan(String value) {
            addCriterion("PLATFORM_URL <", value, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM_URL <=", value, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlLike(String value) {
            addCriterion("PLATFORM_URL like", value, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlNotLike(String value) {
            addCriterion("PLATFORM_URL not like", value, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlIn(List<String> values) {
            addCriterion("PLATFORM_URL in", values, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlNotIn(List<String> values) {
            addCriterion("PLATFORM_URL not in", values, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlBetween(String value1, String value2) {
            addCriterion("PLATFORM_URL between", value1, value2, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andPlatformUrlNotBetween(String value1, String value2) {
            addCriterion("PLATFORM_URL not between", value1, value2, "platformUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumIsNull() {
            addCriterion("SECURITY_TEL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumIsNotNull() {
            addCriterion("SECURITY_TEL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumEqualTo(Short value) {
            addCriterion("SECURITY_TEL_NUM =", value, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumNotEqualTo(Short value) {
            addCriterion("SECURITY_TEL_NUM <>", value, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumGreaterThan(Short value) {
            addCriterion("SECURITY_TEL_NUM >", value, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumGreaterThanOrEqualTo(Short value) {
            addCriterion("SECURITY_TEL_NUM >=", value, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumLessThan(Short value) {
            addCriterion("SECURITY_TEL_NUM <", value, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumLessThanOrEqualTo(Short value) {
            addCriterion("SECURITY_TEL_NUM <=", value, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumIn(List<Short> values) {
            addCriterion("SECURITY_TEL_NUM in", values, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumNotIn(List<Short> values) {
            addCriterion("SECURITY_TEL_NUM not in", values, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumBetween(Short value1, Short value2) {
            addCriterion("SECURITY_TEL_NUM between", value1, value2, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andSecurityTelNumNotBetween(Short value1, Short value2) {
            addCriterion("SECURITY_TEL_NUM not between", value1, value2, "securityTelNum");
            return (Criteria) this;
        }

        public Criteria andIshideiconIsNull() {
            addCriterion("ISHIDEICON is null");
            return (Criteria) this;
        }

        public Criteria andIshideiconIsNotNull() {
            addCriterion("ISHIDEICON is not null");
            return (Criteria) this;
        }

        public Criteria andIshideiconEqualTo(BigDecimal value) {
            addCriterion("ISHIDEICON =", value, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIshideiconNotEqualTo(BigDecimal value) {
            addCriterion("ISHIDEICON <>", value, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIshideiconGreaterThan(BigDecimal value) {
            addCriterion("ISHIDEICON >", value, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIshideiconGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISHIDEICON >=", value, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIshideiconLessThan(BigDecimal value) {
            addCriterion("ISHIDEICON <", value, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIshideiconLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISHIDEICON <=", value, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIshideiconIn(List<BigDecimal> values) {
            addCriterion("ISHIDEICON in", values, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIshideiconNotIn(List<BigDecimal> values) {
            addCriterion("ISHIDEICON not in", values, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIshideiconBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISHIDEICON between", value1, value2, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIshideiconNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISHIDEICON not between", value1, value2, "ishideicon");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleIsNull() {
            addCriterion("ISMARKETVISIBLE is null");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleIsNotNull() {
            addCriterion("ISMARKETVISIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleEqualTo(BigDecimal value) {
            addCriterion("ISMARKETVISIBLE =", value, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleNotEqualTo(BigDecimal value) {
            addCriterion("ISMARKETVISIBLE <>", value, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleGreaterThan(BigDecimal value) {
            addCriterion("ISMARKETVISIBLE >", value, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISMARKETVISIBLE >=", value, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleLessThan(BigDecimal value) {
            addCriterion("ISMARKETVISIBLE <", value, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISMARKETVISIBLE <=", value, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleIn(List<BigDecimal> values) {
            addCriterion("ISMARKETVISIBLE in", values, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleNotIn(List<BigDecimal> values) {
            addCriterion("ISMARKETVISIBLE not in", values, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISMARKETVISIBLE between", value1, value2, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andIsmarketvisibleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISMARKETVISIBLE not between", value1, value2, "ismarketvisible");
            return (Criteria) this;
        }

        public Criteria andForwardurlIsNull() {
            addCriterion("FORWARDURL is null");
            return (Criteria) this;
        }

        public Criteria andForwardurlIsNotNull() {
            addCriterion("FORWARDURL is not null");
            return (Criteria) this;
        }

        public Criteria andForwardurlEqualTo(String value) {
            addCriterion("FORWARDURL =", value, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlNotEqualTo(String value) {
            addCriterion("FORWARDURL <>", value, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlGreaterThan(String value) {
            addCriterion("FORWARDURL >", value, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlGreaterThanOrEqualTo(String value) {
            addCriterion("FORWARDURL >=", value, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlLessThan(String value) {
            addCriterion("FORWARDURL <", value, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlLessThanOrEqualTo(String value) {
            addCriterion("FORWARDURL <=", value, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlLike(String value) {
            addCriterion("FORWARDURL like", value, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlNotLike(String value) {
            addCriterion("FORWARDURL not like", value, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlIn(List<String> values) {
            addCriterion("FORWARDURL in", values, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlNotIn(List<String> values) {
            addCriterion("FORWARDURL not in", values, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlBetween(String value1, String value2) {
            addCriterion("FORWARDURL between", value1, value2, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andForwardurlNotBetween(String value1, String value2) {
            addCriterion("FORWARDURL not between", value1, value2, "forwardurl");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNull() {
            addCriterion("VISIT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andVisitCountIsNotNull() {
            addCriterion("VISIT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitCountEqualTo(Long value) {
            addCriterion("VISIT_COUNT =", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotEqualTo(Long value) {
            addCriterion("VISIT_COUNT <>", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThan(Long value) {
            addCriterion("VISIT_COUNT >", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountGreaterThanOrEqualTo(Long value) {
            addCriterion("VISIT_COUNT >=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThan(Long value) {
            addCriterion("VISIT_COUNT <", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountLessThanOrEqualTo(Long value) {
            addCriterion("VISIT_COUNT <=", value, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountIn(List<Long> values) {
            addCriterion("VISIT_COUNT in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotIn(List<Long> values) {
            addCriterion("VISIT_COUNT not in", values, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountBetween(Long value1, Long value2) {
            addCriterion("VISIT_COUNT between", value1, value2, "visitCount");
            return (Criteria) this;
        }

        public Criteria andVisitCountNotBetween(Long value1, Long value2) {
            addCriterion("VISIT_COUNT not between", value1, value2, "visitCount");
            return (Criteria) this;
        }

        public Criteria andTopicIsNull() {
            addCriterion("TOPIC is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("TOPIC is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("TOPIC =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("TOPIC <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("TOPIC >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("TOPIC >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("TOPIC <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("TOPIC <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("TOPIC like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("TOPIC not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("TOPIC in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("TOPIC not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("TOPIC between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("TOPIC not between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andExtensionimgIsNull() {
            addCriterion("EXTENSIONIMG is null");
            return (Criteria) this;
        }

        public Criteria andExtensionimgIsNotNull() {
            addCriterion("EXTENSIONIMG is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionimgEqualTo(String value) {
            addCriterion("EXTENSIONIMG =", value, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgNotEqualTo(String value) {
            addCriterion("EXTENSIONIMG <>", value, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgGreaterThan(String value) {
            addCriterion("EXTENSIONIMG >", value, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgGreaterThanOrEqualTo(String value) {
            addCriterion("EXTENSIONIMG >=", value, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgLessThan(String value) {
            addCriterion("EXTENSIONIMG <", value, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgLessThanOrEqualTo(String value) {
            addCriterion("EXTENSIONIMG <=", value, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgLike(String value) {
            addCriterion("EXTENSIONIMG like", value, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgNotLike(String value) {
            addCriterion("EXTENSIONIMG not like", value, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgIn(List<String> values) {
            addCriterion("EXTENSIONIMG in", values, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgNotIn(List<String> values) {
            addCriterion("EXTENSIONIMG not in", values, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgBetween(String value1, String value2) {
            addCriterion("EXTENSIONIMG between", value1, value2, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andExtensionimgNotBetween(String value1, String value2) {
            addCriterion("EXTENSIONIMG not between", value1, value2, "extensionimg");
            return (Criteria) this;
        }

        public Criteria andIsextensionIsNull() {
            addCriterion("ISEXTENSION is null");
            return (Criteria) this;
        }

        public Criteria andIsextensionIsNotNull() {
            addCriterion("ISEXTENSION is not null");
            return (Criteria) this;
        }

        public Criteria andIsextensionEqualTo(Short value) {
            addCriterion("ISEXTENSION =", value, "isextension");
            return (Criteria) this;
        }

        public Criteria andIsextensionNotEqualTo(Short value) {
            addCriterion("ISEXTENSION <>", value, "isextension");
            return (Criteria) this;
        }

        public Criteria andIsextensionGreaterThan(Short value) {
            addCriterion("ISEXTENSION >", value, "isextension");
            return (Criteria) this;
        }

        public Criteria andIsextensionGreaterThanOrEqualTo(Short value) {
            addCriterion("ISEXTENSION >=", value, "isextension");
            return (Criteria) this;
        }

        public Criteria andIsextensionLessThan(Short value) {
            addCriterion("ISEXTENSION <", value, "isextension");
            return (Criteria) this;
        }

        public Criteria andIsextensionLessThanOrEqualTo(Short value) {
            addCriterion("ISEXTENSION <=", value, "isextension");
            return (Criteria) this;
        }

        public Criteria andIsextensionIn(List<Short> values) {
            addCriterion("ISEXTENSION in", values, "isextension");
            return (Criteria) this;
        }

        public Criteria andIsextensionNotIn(List<Short> values) {
            addCriterion("ISEXTENSION not in", values, "isextension");
            return (Criteria) this;
        }

        public Criteria andIsextensionBetween(Short value1, Short value2) {
            addCriterion("ISEXTENSION between", value1, value2, "isextension");
            return (Criteria) this;
        }

        public Criteria andIsextensionNotBetween(Short value1, Short value2) {
            addCriterion("ISEXTENSION not between", value1, value2, "isextension");
            return (Criteria) this;
        }

        public Criteria andIstopshowIsNull() {
            addCriterion("ISTOPSHOW is null");
            return (Criteria) this;
        }

        public Criteria andIstopshowIsNotNull() {
            addCriterion("ISTOPSHOW is not null");
            return (Criteria) this;
        }

        public Criteria andIstopshowEqualTo(Short value) {
            addCriterion("ISTOPSHOW =", value, "istopshow");
            return (Criteria) this;
        }

        public Criteria andIstopshowNotEqualTo(Short value) {
            addCriterion("ISTOPSHOW <>", value, "istopshow");
            return (Criteria) this;
        }

        public Criteria andIstopshowGreaterThan(Short value) {
            addCriterion("ISTOPSHOW >", value, "istopshow");
            return (Criteria) this;
        }

        public Criteria andIstopshowGreaterThanOrEqualTo(Short value) {
            addCriterion("ISTOPSHOW >=", value, "istopshow");
            return (Criteria) this;
        }

        public Criteria andIstopshowLessThan(Short value) {
            addCriterion("ISTOPSHOW <", value, "istopshow");
            return (Criteria) this;
        }

        public Criteria andIstopshowLessThanOrEqualTo(Short value) {
            addCriterion("ISTOPSHOW <=", value, "istopshow");
            return (Criteria) this;
        }

        public Criteria andIstopshowIn(List<Short> values) {
            addCriterion("ISTOPSHOW in", values, "istopshow");
            return (Criteria) this;
        }

        public Criteria andIstopshowNotIn(List<Short> values) {
            addCriterion("ISTOPSHOW not in", values, "istopshow");
            return (Criteria) this;
        }

        public Criteria andIstopshowBetween(Short value1, Short value2) {
            addCriterion("ISTOPSHOW between", value1, value2, "istopshow");
            return (Criteria) this;
        }

        public Criteria andIstopshowNotBetween(Short value1, Short value2) {
            addCriterion("ISTOPSHOW not between", value1, value2, "istopshow");
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