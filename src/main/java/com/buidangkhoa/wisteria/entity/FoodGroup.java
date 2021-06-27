package com.buidangkhoa.wisteria.entity;

import java.util.UUID;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;

@Data
@Builder
public class FoodGroup {
  @Default
  UUID id = UUID.randomUUID();
  String name;
}
