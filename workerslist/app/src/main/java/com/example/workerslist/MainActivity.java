package com.example.workerslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    
    package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Attributes {



    }
-----------------------------------com.example.Attributes_.java-----------------------------------

            package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Attributes_ {

        @SerializedName("site_id")
        @Expose
        private Integer siteId;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("maximum_voltage")
        @Expose
        private Integer maximumVoltage;
        @SerializedName("is_active")
        @Expose
        private Boolean isActive;
        @SerializedName("last_seen")
        @Expose
        private String lastSeen;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;
        @SerializedName("is_online")
        @Expose
        private Boolean isOnline;

        public Integer getSiteId() {
            return siteId;
        }

        public void setSiteId(Integer siteId) {
            this.siteId = siteId;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getMaximumVoltage() {
            return maximumVoltage;
        }

        public void setMaximumVoltage(Integer maximumVoltage) {
            this.maximumVoltage = maximumVoltage;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public String getLastSeen() {
            return lastSeen;
        }

        public void setLastSeen(String lastSeen) {
            this.lastSeen = lastSeen;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

        public Boolean getIsOnline() {
            return isOnline;
        }

        public void setIsOnline(Boolean isOnline) {
            this.isOnline = isOnline;
        }

    }
-----------------------------------com.example.Attributes__.java-----------------------------------

            package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Attributes__ {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

    }
-----------------------------------com.example.Data.java-----------------------------------

            package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Data {

        @SerializedName("items")
        @Expose
        private List<Item> items = null;
        @SerializedName("meta")
        @Expose
        private Meta meta;

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

    }
-----------------------------------com.example.Example.java-----------------------------------

            package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Example {

        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("data")
        @Expose
        private Data data;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

    }
-----------------------------------com.example.Inventory.java-----------------------------------

            package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Inventory {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("attributes")
        @Expose
        private Attributes_ attributes;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Attributes_ getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes_ attributes) {
            this.attributes = attributes;
        }

    }
-----------------------------------com.example.Item.java-----------------------------------

            package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Item {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("attributes")
        @Expose
        private Attributes attributes;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }

    }
-----------------------------------com.example.Meta.java-----------------------------------

            package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Meta {

        @SerializedName("total")
        @Expose
        private Integer total;
        @SerializedName("per_page")
        @Expose
        private Integer perPage;
        @SerializedName("current_page")
        @Expose
        private Integer currentPage;
        @SerializedName("last_page")
        @Expose
        private Integer lastPage;
        @SerializedName("next")
        @Expose
        private Object next;
        @SerializedName("previous")
        @Expose
        private Object previous;

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getPerPage() {
            return perPage;
        }

        public void setPerPage(Integer perPage) {
            this.perPage = perPage;
        }

        public Integer getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
        }

        public Integer getLastPage() {
            return lastPage;
        }

        public void setLastPage(Integer lastPage) {
            this.lastPage = lastPage;
        }

        public Object getNext() {
            return next;
        }

        public void setNext(Object next) {
            this.next = next;
        }

        public Object getPrevious() {
            return previous;
        }

        public void setPrevious(Object previous) {
            this.previous = previous;
        }

    }
-----------------------------------com.example.Role.java-----------------------------------

            package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Role {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("attributes")
        @Expose
        private Attributes__ attributes;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Attributes__ getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes__ attributes) {
            this.attributes = attributes;
        }

    }

}
