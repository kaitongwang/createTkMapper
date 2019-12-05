package com.example.transfer.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User {
    /**
     * 由系统自动分配的全局唯一注册id，默认为一个36位的uuid串。平台内部对用户进行操作或构建Web端变量（如树节点Id）时使用该值
     */
    @Column(name = "uniqueId")
    private String uniqueid;

    /**
     * 登录账户名，全局不重复。该值为AWS平台上层及业务解决方案引用账户的唯一标识
     */
    private String uid;

    /**
     * 所在部门Id
     */
    @Column(name = "departmentId")
    private String departmentid;

    /**
     * 企业id
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 新航天员工ID
     */
    private String newspaceuserid;

    /**
     * 角色Id
     */
    @Column(name = "userRole_id")
    private String userroleId;

    /**
     * 加密后的口令
     */
    private String password;

    /**
     * 支付密码
     */
    private String paypassword;

    /**
     * 是否被注销，注销后不显示、不可用（1：未注销，0：注销）
     */
    @Column(name = "isClosed")
    private Integer isclosed;

    /**
     * 姓名
     */
    @Column(name = "userName")
    private String username;

    /**
     * 账户友好别名(规则为uid，如果两者相同时只取其一)
     */
    @Column(name = "userNameAlias")
    private String usernamealias;

    /**
     * 用户编号
     */
    @Column(name = "userNo")
    private String userno;

    /**
     * 是否部门管理者（0：不是，1：是）
     */
    @Column(name = "isManager")
    private Integer ismanager;

    /**
     * 电话
     */
    @Column(name = "officeTel")
    private String officetel;

    /**
     * 传真
     */
    @Column(name = "officeFax")
    private String officefax;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 互联网邮件
     */
    private String email;

    /**
     * 显示索引
     */
    @Column(name = "orderIndex")
    private Integer orderindex;

    /**
     * aws员工状态(0：冻结，1，激活)
     */
    private Integer userstatus;

    /**
     * 工作状态
     */
    @Column(name = "workStatus")
    private String workstatus;

    /**
     * 职位名称
     */
    @Column(name = "positionName")
    private String positionname;

    /**
     * 该账户姓名的拼音缩写前缀字母
     */
    @Column(name = "preSpell")
    private String prespell;

    /**
     * 该账号的全拼拼音字母
     */
    private String spell;

    /**
     * 头像地址
     */
    @Column(name = "head_image")
    private String headImage;

    /**
     * 1男2女3保密
     */
    private Integer sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 单位最后修改时间
     */
    @Column(name = "updateDate")
    private Date updatedate;

    /**
     * 返回用户安全级别，默认是公开
     */
    @Column(name = "securityLevel")
    private Integer securitylevel;

    /**
     * 返回校验摘要信息
     */
    @Column(name = "userSummary")
    private String usersummary;

    /**
     * 部门国际化名称
     */
    @Column(name = "nameI18N")
    private String namei18n;

    /**
     * 最后修改时间戳
     */
    @Column(name = "modifyTime")
    private Date modifytime;

    /**
     * 获取由系统自动分配的全局唯一注册id，默认为一个36位的uuid串。平台内部对用户进行操作或构建Web端变量（如树节点Id）时使用该值
     *
     * @return uniqueId - 由系统自动分配的全局唯一注册id，默认为一个36位的uuid串。平台内部对用户进行操作或构建Web端变量（如树节点Id）时使用该值
     */
    public String getUniqueid() {
        return uniqueid;
    }

    /**
     * 设置由系统自动分配的全局唯一注册id，默认为一个36位的uuid串。平台内部对用户进行操作或构建Web端变量（如树节点Id）时使用该值
     *
     * @param uniqueid 由系统自动分配的全局唯一注册id，默认为一个36位的uuid串。平台内部对用户进行操作或构建Web端变量（如树节点Id）时使用该值
     */
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid == null ? null : uniqueid.trim();
    }

    /**
     * 获取登录账户名，全局不重复。该值为AWS平台上层及业务解决方案引用账户的唯一标识
     *
     * @return uid - 登录账户名，全局不重复。该值为AWS平台上层及业务解决方案引用账户的唯一标识
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置登录账户名，全局不重复。该值为AWS平台上层及业务解决方案引用账户的唯一标识
     *
     * @param uid 登录账户名，全局不重复。该值为AWS平台上层及业务解决方案引用账户的唯一标识
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * 获取所在部门Id
     *
     * @return departmentId - 所在部门Id
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * 设置所在部门Id
     *
     * @param departmentid 所在部门Id
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    /**
     * 获取企业id
     *
     * @return company_id - 企业id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置企业id
     *
     * @param companyId 企业id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * 获取新航天员工ID
     *
     * @return newspaceuserid - 新航天员工ID
     */
    public String getNewspaceuserid() {
        return newspaceuserid;
    }

    /**
     * 设置新航天员工ID
     *
     * @param newspaceuserid 新航天员工ID
     */
    public void setNewspaceuserid(String newspaceuserid) {
        this.newspaceuserid = newspaceuserid == null ? null : newspaceuserid.trim();
    }

    /**
     * 获取角色Id
     *
     * @return userRole_id - 角色Id
     */
    public String getUserroleId() {
        return userroleId;
    }

    /**
     * 设置角色Id
     *
     * @param userroleId 角色Id
     */
    public void setUserroleId(String userroleId) {
        this.userroleId = userroleId == null ? null : userroleId.trim();
    }

    /**
     * 获取加密后的口令
     *
     * @return password - 加密后的口令
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置加密后的口令
     *
     * @param password 加密后的口令
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取支付密码
     *
     * @return paypassword - 支付密码
     */
    public String getPaypassword() {
        return paypassword;
    }

    /**
     * 设置支付密码
     *
     * @param paypassword 支付密码
     */
    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    /**
     * 获取是否被注销，注销后不显示、不可用（1：未注销，0：注销）
     *
     * @return isClosed - 是否被注销，注销后不显示、不可用（1：未注销，0：注销）
     */
    public Integer getIsclosed() {
        return isclosed;
    }

    /**
     * 设置是否被注销，注销后不显示、不可用（1：未注销，0：注销）
     *
     * @param isclosed 是否被注销，注销后不显示、不可用（1：未注销，0：注销）
     */
    public void setIsclosed(Integer isclosed) {
        this.isclosed = isclosed;
    }

    /**
     * 获取姓名
     *
     * @return userName - 姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置姓名
     *
     * @param username 姓名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取账户友好别名(规则为uid，如果两者相同时只取其一)
     *
     * @return userNameAlias - 账户友好别名(规则为uid，如果两者相同时只取其一)
     */
    public String getUsernamealias() {
        return usernamealias;
    }

    /**
     * 设置账户友好别名(规则为uid，如果两者相同时只取其一)
     *
     * @param usernamealias 账户友好别名(规则为uid，如果两者相同时只取其一)
     */
    public void setUsernamealias(String usernamealias) {
        this.usernamealias = usernamealias == null ? null : usernamealias.trim();
    }

    /**
     * 获取用户编号
     *
     * @return userNo - 用户编号
     */
    public String getUserno() {
        return userno;
    }

    /**
     * 设置用户编号
     *
     * @param userno 用户编号
     */
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    /**
     * 获取是否部门管理者（0：不是，1：是）
     *
     * @return isManager - 是否部门管理者（0：不是，1：是）
     */
    public Integer getIsmanager() {
        return ismanager;
    }

    /**
     * 设置是否部门管理者（0：不是，1：是）
     *
     * @param ismanager 是否部门管理者（0：不是，1：是）
     */
    public void setIsmanager(Integer ismanager) {
        this.ismanager = ismanager;
    }

    /**
     * 获取电话
     *
     * @return officeTel - 电话
     */
    public String getOfficetel() {
        return officetel;
    }

    /**
     * 设置电话
     *
     * @param officetel 电话
     */
    public void setOfficetel(String officetel) {
        this.officetel = officetel == null ? null : officetel.trim();
    }

    /**
     * 获取传真
     *
     * @return officeFax - 传真
     */
    public String getOfficefax() {
        return officefax;
    }

    /**
     * 设置传真
     *
     * @param officefax 传真
     */
    public void setOfficefax(String officefax) {
        this.officefax = officefax == null ? null : officefax.trim();
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取互联网邮件
     *
     * @return email - 互联网邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置互联网邮件
     *
     * @param email 互联网邮件
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取显示索引
     *
     * @return orderIndex - 显示索引
     */
    public Integer getOrderindex() {
        return orderindex;
    }

    /**
     * 设置显示索引
     *
     * @param orderindex 显示索引
     */
    public void setOrderindex(Integer orderindex) {
        this.orderindex = orderindex;
    }

    /**
     * 获取aws员工状态(0：冻结，1，激活)
     *
     * @return userstatus - aws员工状态(0：冻结，1，激活)
     */
    public Integer getUserstatus() {
        return userstatus;
    }

    /**
     * 设置aws员工状态(0：冻结，1，激活)
     *
     * @param userstatus aws员工状态(0：冻结，1，激活)
     */
    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    /**
     * 获取工作状态
     *
     * @return workStatus - 工作状态
     */
    public String getWorkstatus() {
        return workstatus;
    }

    /**
     * 设置工作状态
     *
     * @param workstatus 工作状态
     */
    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus == null ? null : workstatus.trim();
    }

    /**
     * 获取职位名称
     *
     * @return positionName - 职位名称
     */
    public String getPositionname() {
        return positionname;
    }

    /**
     * 设置职位名称
     *
     * @param positionname 职位名称
     */
    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    /**
     * 获取该账户姓名的拼音缩写前缀字母
     *
     * @return preSpell - 该账户姓名的拼音缩写前缀字母
     */
    public String getPrespell() {
        return prespell;
    }

    /**
     * 设置该账户姓名的拼音缩写前缀字母
     *
     * @param prespell 该账户姓名的拼音缩写前缀字母
     */
    public void setPrespell(String prespell) {
        this.prespell = prespell == null ? null : prespell.trim();
    }

    /**
     * 获取该账号的全拼拼音字母
     *
     * @return spell - 该账号的全拼拼音字母
     */
    public String getSpell() {
        return spell;
    }

    /**
     * 设置该账号的全拼拼音字母
     *
     * @param spell 该账号的全拼拼音字母
     */
    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    /**
     * 获取头像地址
     *
     * @return head_image - 头像地址
     */
    public String getHeadImage() {
        return headImage;
    }

    /**
     * 设置头像地址
     *
     * @param headImage 头像地址
     */
    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    /**
     * 获取1男2女3保密
     *
     * @return sex - 1男2女3保密
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置1男2女3保密
     *
     * @param sex 1男2女3保密
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取单位最后修改时间
     *
     * @return updateDate - 单位最后修改时间
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * 设置单位最后修改时间
     *
     * @param updatedate 单位最后修改时间
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * 获取返回用户安全级别，默认是公开
     *
     * @return securityLevel - 返回用户安全级别，默认是公开
     */
    public Integer getSecuritylevel() {
        return securitylevel;
    }

    /**
     * 设置返回用户安全级别，默认是公开
     *
     * @param securitylevel 返回用户安全级别，默认是公开
     */
    public void setSecuritylevel(Integer securitylevel) {
        this.securitylevel = securitylevel;
    }

    /**
     * 获取返回校验摘要信息
     *
     * @return userSummary - 返回校验摘要信息
     */
    public String getUsersummary() {
        return usersummary;
    }

    /**
     * 设置返回校验摘要信息
     *
     * @param usersummary 返回校验摘要信息
     */
    public void setUsersummary(String usersummary) {
        this.usersummary = usersummary == null ? null : usersummary.trim();
    }

    /**
     * 获取部门国际化名称
     *
     * @return nameI18N - 部门国际化名称
     */
    public String getNamei18n() {
        return namei18n;
    }

    /**
     * 设置部门国际化名称
     *
     * @param namei18n 部门国际化名称
     */
    public void setNamei18n(String namei18n) {
        this.namei18n = namei18n == null ? null : namei18n.trim();
    }

    /**
     * 获取最后修改时间戳
     *
     * @return modifyTime - 最后修改时间戳
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * 设置最后修改时间戳
     *
     * @param modifytime 最后修改时间戳
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}