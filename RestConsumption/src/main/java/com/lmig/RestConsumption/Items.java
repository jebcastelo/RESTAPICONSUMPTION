package com.lmig.RestConsumption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {
     private String etag;
     private String selfLink;
    
        
        public String getEtag() {
            return etag;
        }

        public String getSelfLink() {
            return selfLink;
        }

        public void setSelfLink(String selfLink) {
            this.selfLink = selfLink;
        }

        public void setEtag(String etag) {
            this.etag = etag;
        }

        
//        @Override
//        public String toString() {
//            return "items{" +
//                    "kind='" + kind + '\'' +
//                    "etag='" + items.getEtag() + '\'' +
//                    ", Publisher=" + items.getPublisher() +
//                    ", PublishedDate=" + items.getPublishedDate() +
//                    ", Description=" + items.getDescription() +
//                    '}';
//        }
}