package com.cc.learncode.guava;

import java.util.Comparator;
import java.util.HashMap;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;

public class OptionalTest {

	public static void main(String[] args) {
		
			String key = "321";
		
			Preconditions.checkNotNull(key);
			
			//hash
			System.out.println(Objects.hashCode(key));
			//对象序列
			System.out.println(MoreObjects.toStringHelper(key).add("1", "2"));
			//比较器
			System.out.println(ComparisonChain.start().compare(key, "K2", new Comparator<String>(){
				@Override
				public int compare(String o1, String o2) {
					return o1.equals(o2) ? 1 : -1;
				}
			}).result());
			
			Optional<String> optional2 = Optional.of(key);
			
			System.out.println(optional2.isPresent());
			System.out.println(optional2.or("321"));
			System.out.println(optional2.orNull());
			System.out.println(optional2.asSet());
			
			HashMap<String, String> hashMap = Maps.newHashMap();
			hashMap.put("K1", "V1");
			hashMap.put("K2", "V2");
			
			HashMap<String, String> hashMap2 = Maps.newHashMap();
			hashMap2.put("sK1", "sV1");
			hashMap2.put("sK2", "sV2");
			
			//排序
			Ordering<HashMap<String, String>> ordering =  Ordering.natural().nullsLast().onResultOf(new Function<HashMap<String, String>, String>() {
				@Override
				public String apply(HashMap<String, String> input) {
					return Optional.fromNullable(input).isPresent() ? input.get("K1") : null;
				}
			});
			
			System.out.println(ordering.sortedCopy(Lists.newArrayList(hashMap,hashMap2,null)));
			
			Optional<HashMap<String, String>> optional =  Optional.of(hashMap);
			System.out.println(optional.get().get(optional2.get()));
		}
}
