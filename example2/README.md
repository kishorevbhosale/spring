# Spring NoUniqueBeanDefinitionException Example

This project demonstrates the `NoUniqueBeanDefinitionException`, which occurs in Spring when there are multiple beans of the same type, and Spring cannot determine which one to inject due to ambiguity.

## Problem Overview

When you define multiple beans of the same type (in this case, `Vehicle`) within the Spring configuration, and then try to retrieve a bean of that type without specifying which one, Spring throws the `NoUniqueBeanDefinitionException`. This happens because Spring expects a single matching bean but finds multiple beans of the same type.

### Exception


### Cause

- The Spring container found **three `Vehicle` beans**: `vehicle1`, `vehicle2`, and `vehicle3`, but you requested a single bean of type `Vehicle`.
- Since there are multiple beans of the same type, Spring cannot decide which one to provide, resulting in the `NoUniqueBeanDefinitionException`.

## How to Fix

1. **Specify Bean Name Explicitly**: To resolve this issue, you need to specify the bean name when retrieving the bean from the Spring context. For example:

   ```java
   Vehicle veh = context.getBean("vehicle1", Vehicle.class);
