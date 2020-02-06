package com.example.mynytimesnew.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media {
    @SerializedName("copyright")
    @Expose


    private String copyright;
    @SerializedName("media-metadata")
    @Expose


    private Mediametadata[] mediametadata;
    @SerializedName("subtype")
    @Expose


    private String subtype;
    @SerializedName("type")
    @Expose




    private String type;
    @SerializedName("approved_for_syndication")
    @Expose


    private String approved_for_syndication;


    public String getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (String copyright)
    {
        this.copyright = copyright;
    }

    public Mediametadata[] getMediametadata ()
    {
        return mediametadata;
    }

    public void setMediametadata (Mediametadata[] mediametadata)
    {
        this.mediametadata = mediametadata;
    }

    public String getSubtype ()
    {
        return subtype;
    }

    public void setSubtype (String subtype)
    {
        this.subtype = subtype;
    }



    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getApproved_for_syndication ()
    {
        return approved_for_syndication;
    }

    public void setApproved_for_syndication (String approved_for_syndication)
    {
        this.approved_for_syndication = approved_for_syndication;
    }


}
