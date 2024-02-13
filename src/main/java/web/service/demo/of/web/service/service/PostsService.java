package web.service.demo.of.web.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.service.demo.of.web.service.entity.Post;

@Service
public class PostsService {
	List<Post> posts=new ArrayList<>();

	public PostsService() {
		posts.add(new Post(1,"Data type 1", "Sample Text 1"));
		posts.add(new Post(2,"Data type 2", "Sample Text 2"));
		posts.add(new Post(3,"Data type 3", "Sample Text 3"));
		posts.add(new Post(4,"Data type 4", "Sample Text 4"));
		posts.add(new Post(5,"Data type 5", "Sample Text 5"));
	}

	public List<Post> getPosts(){
		return posts;
	}

	public Post getPost(int postId) {
		for(Post post: posts) {
			if(post.getPostId()== postId) {
				return post;
			}
		}
		return null;
	}

	public void addPost(Post listElement) {
		posts.add(listElement);
	}

	public void deletePost(int postId) {
		for(Post temp:posts) {
			if(temp.getPostId() == postId) {
				int index=posts.indexOf(temp);
				posts.remove(index);
			}
		}

	}

}
