package com.example.mynytimesnew.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {
    @SerializedName("copyright")
    @Expose
    private String copyright;



    @SerializedName("num_results")
    @Expose

    private String num_results;
    @SerializedName("status")
    @Expose

    private String status;

    @SerializedName("results")
    private List<Results> results;

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public String getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (String copyright)
    {
        this.copyright = copyright;
    }



    public String getNum_results ()
    {
        return num_results;
    }

    public void setNum_results (String num_results)
    {
        this.num_results = num_results;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }


}
