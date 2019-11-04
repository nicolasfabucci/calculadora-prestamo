package com.eiv.enums;

public enum RegionEnum {
    NOROESTE("NOA"),
    NORDESTE("NOE"),
    PAMPEANA("PAM"),
    CUYO("CUY"),
    PATAGONIA("PAT");
    
    private String region;

    public String getRegion() {
        return region;
    }
    
    private RegionEnum (String region) {
        this.region = region;        
    }
    
    public static RegionEnum of(String region) {
       
        if (region == null || region.trim().length() == 0 || region.trim().length() > 3) {
            throw new IllegalArgumentException("La región no puede ser nula");            
        } else if (region.trim().equalsIgnoreCase("NOA")) {
            return NOROESTE;            
        } else if (region.trim().equalsIgnoreCase("NOE")) {
            return NORDESTE;            
        } else if (region.trim().equalsIgnoreCase("PAM")) {
            return PAMPEANA;            
        } else if (region.trim().equalsIgnoreCase("CUY")) {
            return CUYO;            
        } else if (region.trim().equalsIgnoreCase("PAT")) {
            return PATAGONIA;            
        } else {
            throw new IllegalArgumentException(
                    String.format("No se reconose %s como una región", region));
        }
        
    }
    
}
