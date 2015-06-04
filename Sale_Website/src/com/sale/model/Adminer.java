package com.sale.model;

/**
 * Adminer entity. @author MyEclipse Persistence Tools
 */

public class Adminer implements java.io.Serializable {

	// Fields

	private Integer adminerId;
	private String adminerBorn;
	private String adminerName;
	private String adminerSex;
	private String adminerEmail;
	private String adminerMsn;
	private String adminerQq;
	private String adminerOfficerphone;
	private String adminerHomephone;
	private String adminerMobilephone;
	private String adminerPassword;

	// Constructors

	/** default constructor */
	public Adminer() {
	}

	/** minimal constructor */
	public Adminer(Integer adminerId) {
		this.adminerId = adminerId;
	}

	/** full constructor */
	public Adminer(Integer adminerId, String adminerBorn, String adminerName,
			String adminerSex, String adminerEmail, String adminerMsn,
			String adminerQq, String adminerOfficerphone,
			String adminerHomephone, String adminerMobilephone,
			String adminerPassword) {
		this.adminerId = adminerId;
		this.adminerBorn = adminerBorn;
		this.adminerName = adminerName;
		this.adminerSex = adminerSex;
		this.adminerEmail = adminerEmail;
		this.adminerMsn = adminerMsn;
		this.adminerQq = adminerQq;
		this.adminerOfficerphone = adminerOfficerphone;
		this.adminerHomephone = adminerHomephone;
		this.adminerMobilephone = adminerMobilephone;
		this.adminerPassword = adminerPassword;
	}

	// Property accessors

	public Integer getAdminerId() {
		return this.adminerId;
	}

	public void setAdminerId(Integer adminerId) {
		this.adminerId = adminerId;
	}

	public String getAdminerBorn() {
		return this.adminerBorn;
	}

	public void setAdminerBorn(String adminerBorn) {
		this.adminerBorn = adminerBorn;
	}

	public String getAdminerName() {
		return this.adminerName;
	}

	public void setAdminerName(String adminerName) {
		this.adminerName = adminerName;
	}

	public String getAdminerSex() {
		return this.adminerSex;
	}

	public void setAdminerSex(String adminerSex) {
		this.adminerSex = adminerSex;
	}

	public String getAdminerEmail() {
		return this.adminerEmail;
	}

	public void setAdminerEmail(String adminerEmail) {
		this.adminerEmail = adminerEmail;
	}

	public String getAdminerMsn() {
		return this.adminerMsn;
	}

	public void setAdminerMsn(String adminerMsn) {
		this.adminerMsn = adminerMsn;
	}

	public String getAdminerQq() {
		return this.adminerQq;
	}

	public void setAdminerQq(String adminerQq) {
		this.adminerQq = adminerQq;
	}

	public String getAdminerOfficerphone() {
		return this.adminerOfficerphone;
	}

	public void setAdminerOfficerphone(String adminerOfficerphone) {
		this.adminerOfficerphone = adminerOfficerphone;
	}

	public String getAdminerHomephone() {
		return this.adminerHomephone;
	}

	public void setAdminerHomephone(String adminerHomephone) {
		this.adminerHomephone = adminerHomephone;
	}

	public String getAdminerMobilephone() {
		return this.adminerMobilephone;
	}

	public void setAdminerMobilephone(String adminerMobilephone) {
		this.adminerMobilephone = adminerMobilephone;
	}

	public String getAdminerPassword() {
		return this.adminerPassword;
	}

	public void setAdminerPassword(String adminerPassword) {
		this.adminerPassword = adminerPassword;
	}

}