package com.buidangkhoa.wisteria.entity;

import java.util.List;
import java.util.UUID;
import lombok.Builder.Default;
import lombok.Data;

@Data
public class FoodItem {
  @Default
  UUID id = UUID.randomUUID();
  String name;
  List<FoodGroup> groups;
}
