package com.easywine.tastnote.pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.easywine.code.pojo.Body;
import com.easywine.code.pojo.Colour;
import com.easywine.code.pojo.Country;
import com.easywine.code.pojo.Finish;
import com.easywine.code.pojo.Flavour;
import com.easywine.code.pojo.Intensity;
import com.easywine.code.pojo.Quality;
import com.easywine.code.pojo.Region;
import com.easywine.code.pojo.Sweetness;
import com.easywine.code.pojo.Tannin;

public class TastNote {
	private Integer  tastNoteID;
	private String producer;
	private Region region;
	private Country country;
	private String vintage;
	private Date tastDate;
	private BigDecimal marktingPrice;
	private BigDecimal getPrice;
	private Integer clarity;  // 0:Clear  1:dull
	private Intensity intensity; //0:pale 1:medium  2:deep
	private Colour colour;
	private String appearanceMemo;
	private Flavour flavour;
	private Body body;
	private Finish finish;
	private Quality quality;
	private Sweetness sweetness;
	private Tannin tannin;
	public Integer getTastNoteID() {
		return tastNoteID;
	}
	public void setTastNoteID(Integer tastNoteID) {
		this.tastNoteID = tastNoteID;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getVintage() {
		return vintage;
	}
	public void setVintage(String vintage) {
		this.vintage = vintage;
	}
	public Date getTastDate() {
		return tastDate;
	}
	public void setTastDate(Date tastDate) {
		this.tastDate = tastDate;
	}
	public BigDecimal getMarktingPrice() {
		return marktingPrice;
	}
	public void setMarktingPrice(BigDecimal marktingPrice) {
		this.marktingPrice = marktingPrice;
	}
	public BigDecimal getGetPrice() {
		return getPrice;
	}
	public void setGetPrice(BigDecimal getPrice) {
		this.getPrice = getPrice;
	}
	public Integer getClarity() {
		return clarity;
	}
	public void setClarity(Integer clarity) {
		this.clarity = clarity;
	}
	public Intensity getIntensity() {
		return intensity;
	}
	public void setIntensity(Intensity intensity) {
		this.intensity = intensity;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	public String getAppearanceMemo() {
		return appearanceMemo;
	}
	public void setAppearanceMemo(String appearanceMemo) {
		this.appearanceMemo = appearanceMemo;
	}
	public Flavour getFlavour() {
		return flavour;
	}
	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Finish getFinish() {
		return finish;
	}
	public void setFinish(Finish finish) {
		this.finish = finish;
	}
	public Quality getQuality() {
		return quality;
	}
	public void setQuality(Quality quality) {
		this.quality = quality;
	}
	public Sweetness getSweetness() {
		return sweetness;
	}
	public void setSweetness(Sweetness sweetness) {
		this.sweetness = sweetness;
	}
	public Tannin getTannin() {
		return tannin;
	}
	public void setTannin(Tannin tannin) {
		this.tannin = tannin;
	}
	
	
}
