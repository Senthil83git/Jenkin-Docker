package web.service.demo.of.web.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import web.service.demo.of.web.service.entity.Post;
import web.service.demo.of.web.service.service.PostsService;


@RestController
public class PostsController {
	
	@Autowired
	PostsService postsService;
	
	
	@RequestMapping("posts")
	public List<Post> getPosts(){
		return postsService.getPosts();
	}
	
	@RequestMapping("posts/{postId}")
	public Post getPost(@PathVariable int postId){
		return postsService.getPost(postId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "posts")
	public void addPost(@RequestBody Post listElement) {
		postsService.addPost(listElement);
	}

	@DeleteMapping("posts/{postId}")
	public void deletePost(@PathVariable int postId) {
		postsService.deletePost(postId);
	}
	
	@RequestMapping("listblogs")
	public String listBlogs() {
		return "Blogs listed";
	}

}

