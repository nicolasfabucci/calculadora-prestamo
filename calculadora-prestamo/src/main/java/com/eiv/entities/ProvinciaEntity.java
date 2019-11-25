package com.eiv.entities;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eiv.converters.RegionConverter;
import com.eiv.enums.RegionEnum;

@Entity
@Table(name = "provincias")
public class ProvinciaEntity {
    
    @Id
    @Column(name = "id_provincia")
    private long id;
    
    @Column(name = "nombre", length = 400, nullable = false, unique = true)
    private String nombre;
    
    @Convert(converter = RegionConverter.class)
    @Column(name = "region", nullable = false, length = 3)
    private RegionEnum region;
    
    public ProvinciaEntity() {
    }    
    
    public ProvinciaEntity(long id, String nombre, RegionEnum region) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.region = region;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RegionEnum getRegion() {
        return region;
    }

    public void setRegion(RegionEnum region) {
        this.region = region;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ProvinciaEntity other = (ProvinciaEntity) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProvinciaEntity [id=" + id + ", nombre=" + nombre + "]";
    }

}
