package com.example.mynytimesnew.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("per_facet")
    @Expose


    private String [] per_facet;
    @SerializedName("org_facet")
    @Expose


    private String[] org_facet;
    @SerializedName("section")
    @Expose




    private String section;
    @SerializedName("abstract")
    @Expose


    private String Abstract;
    @SerializedName("source")
    @Expose


    private String source;
    @SerializedName("asset_id")
    @Expose


    private String asset_id;
    @SerializedName(" media")
    @Expose


    private Media[] media;
    @SerializedName("type")
    @Expose


    private String type;
    @SerializedName("title")
    @Expose


    private String title;
    @SerializedName("des_facet")
    @Expose


    private String[] des_facet;
    @SerializedName("url")
    @Expose


    private String url;
    @SerializedName("adx_keywords")
    @Expose


    private String adx_keywords;
    @SerializedName("geo_facet")
    @Expose


    private String geo_facet;
    @SerializedName("id")
    @Expose


    private String id;
    @SerializedName("byline")
    @Expose


    private String byline;
    @SerializedName("published_date")
    @Expose


    private String published_date;
    @SerializedName("views")
    @Expose


    private String views;

    public String[] getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(String[] per_facet) {
        this.per_facet = per_facet;
    }

    public String[] getOrg_facet ()
    {
        return org_facet;
    }

    public void setOrg_facet (String[] org_facet)
    {
        this.org_facet = org_facet;
    }



    public String getSection ()
    {
        return section;
    }

    public void setSection (String section)
    {
        this.section = section;
    }

    public String getAbstract ()
    {
        return Abstract;
    }

    public void setAbstract (String Abstract)
    {
        this.Abstract = Abstract;
    }

    public String getSource ()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
    }

    public String getAsset_id ()
    {
        return asset_id;
    }

    public void setAsset_id (String asset_id)
    {
        this.asset_id = asset_id;
    }

    public Media[] getMedia ()
    {
        return media;
    }

    public void setMedia (Media[] media)
    {
        this.media = media;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String[] getDes_facet ()
    {
        return des_facet;
    }

    public void setDes_facet (String[] des_facet)
    {
        this.des_facet = des_facet;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getAdx_keywords ()
    {
        return adx_keywords;
    }

    public void setAdx_keywords (String adx_keywords)
    {
        this.adx_keywords = adx_keywords;
    }

    public String getGeo_facet ()
    {
        return geo_facet;
    }

    public void setGeo_facet (String geo_facet)
    {
        this.geo_facet = geo_facet;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getByline ()
    {
        return byline;
    }

    public void setByline (String byline)
    {
        this.byline = byline;
    }

    public String getPublished_date ()
    {
        return published_date;
    }

    public void setPublished_date (String published_date)
    {
        this.published_date = published_date;
    }

    public String getViews ()
    {
        return views;
    }

    public void setViews (String views)
    {
        this.views = views;
    }


}
