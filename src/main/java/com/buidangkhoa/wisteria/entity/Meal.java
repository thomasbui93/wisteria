package com.buidangkhoa.wisteria.entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;

@Data
@Builder
public class Meal {
  @Default
  UUID id = UUID.randomUUID();
  MealType type;
  List<FoodItem> foodItems;
  Date date;
}
