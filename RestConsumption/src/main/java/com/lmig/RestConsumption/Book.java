package com.lmig.RestConsumption;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Book {

	    
	    private String kind;
	    private List<Items> items;
	   

	    public List<Items> getItems() {
	        return items;
	    }

	    public void setItems(List<Items> items) {
	        this.items = items;
	    }

	    public Book() { 
	    }

//	    public Book(String kind,String kind2, String kind3) {
//	        this.kind=kind;
//	        this.=kind;
//	        this.kind=kind;
//	    }

	    public String getKind() {
	         return kind;
	     }

	     public void setKind(String kind) {
	         this.kind = kind;
	     }
	  

	    @Override
	    public String toString() {
	        return "Book{" +
	                "kind='" + kind + '\'' +
	                "etag='" + items.get(0).getEtag() +
	                ", Self link=" + items.get(0).getSelfLink() +
	                '}';
	    }
	}

