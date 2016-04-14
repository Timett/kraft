package cn.kyrioscraft.kraft.web.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.kyrioscraft.kraft.web.beans.FullName;
import cn.kyrioscraft.kraft.web.beans.Person;
import cn.kyrioscraft.kraft.web.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	
	private Person createAPerson(String name, List<Person> friends) {
		Person newPerson = new Person();
		newPerson.setName(name);
		newPerson.setFullName(new FullName("xxx_first", "xxx_middle",
				"xxx_last"));
		newPerson.setAge(24);
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("篮球");
		hobbies.add("游泳");
		hobbies.add("coding");
		newPerson.setHobbies(hobbies);
		Map<String, String> clothes = new HashMap<String, String>();
		clothes.put("coat", "Nike");
		clothes.put("trousers", "adidas");
		clothes.put("shoes", "安踏");
		newPerson.setClothes(clothes);
		newPerson.setFriends(friends);
		return newPerson;
	}
	
	@Override
	public Person getPersonData() {
		List<Person> friends = new ArrayList<Person>();
		friends.add(createAPerson("小明", null));
		friends.add(createAPerson("Tony", null));
		friends.add(createAPerson("陈小二", null));
		return createAPerson("邵同学", friends);
	}

}
