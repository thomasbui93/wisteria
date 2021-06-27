package com.buidangkhoa.wisteria;

import com.buidangkhoa.wisteria.entity.FoodGroup;
import com.buidangkhoa.wisteria.entity.FoodItem;
import com.buidangkhoa.wisteria.entity.Meal;
import graphql.schema.DataFetcher;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class GraphQLDataFetchers {

  public DataFetcher<List<Meal>> getMeals() {
    return data -> null;
  }

  public DataFetcher<List<FoodItem>> getFoodItems() {
    return data -> null;
  }

  public DataFetcher<List<FoodGroup>> getFoodGroups() {
    return data -> null;
  }
}
