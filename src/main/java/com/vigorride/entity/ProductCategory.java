package com.vigorride.entity;

import java.math.BigDecimal;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="Product_Category")
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	
	@NonNull
	@Column(name="promotion_id",nullable=false)
	private String promotionId;

	@NotNull
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="category_description",nullable=false)
	private String categoryDescription;

}
