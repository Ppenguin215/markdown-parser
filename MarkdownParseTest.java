import static org.junit.Assert.*;


import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;

import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import java.util.*;

public class MarkdownParseTest {
    /** 
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test

    
    public void testFile() throws IOException{
        Path fileName = Path.of("test-file.md");
        int one = 1;
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"),MarkdownParse.getLinks(content));
    }

    @Test
    public void break1() throws IOException{
        Path fileName = Path.of("breaking-test1.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(),MarkdownParse.getLinks(content));
    }

    @Test
    public void break3() throws IOException{
        Path fileName = Path.of("breaking-test2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"),MarkdownParse.getLinks(content));
    }

    @Test
    public void break2() throws IOException{
        Path fileName = Path.of("breaking-test3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com"),MarkdownParse.getLinks(content));
    }

    @Test
    public void testLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com", "some-thing.html"));
    }
    @Test
    public void testLink2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com", "some-page.html"));
    }
    @Test
    public void testLink3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("a link on the first line"));
    }
    @Test
    public void testLink9() throws IOException{
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    public void link1() throws IOException {
        Path fileName = Path.of( "test1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("https://something.com", "some-thing.html");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void link2() throws IOException {
        Path fileName = Path.of( "test2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("https://something.com", "some-thing.html");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void link3() throws IOException {
        Path fileName = Path.of( "test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("https://something.com", "some-thing.html");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void link4() throws IOException {
        Path fileName = Path.of( "testFile.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("google", "google translate");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file2() throws IOException {
        Path fileName = Path.of( "test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("https://something.com", "some-page.html");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file3() throws IOException {
        Path fileName = Path.of( "test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of();
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file4() throws IOException {
        Path fileName = Path.of( "test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of();
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file5() throws IOException {
        Path fileName = Path.of( "test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("page.com");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file6() throws IOException {
        Path fileName = Path.of( "test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("page.com");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }
/**
    @Test
    public void file7() throws IOException {
        Path fileName = Path.of( "test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("1");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file8() throws IOException {
        Path fileName = Path.of( "test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("28");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }
    */

    @Test
    public void testSnippet1() throws IOException{
        String contents = Files.readString(Path.of("snippet1.md"));
        assertEquals(List.of("google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testSnippet2() throws IOException{
        String contents = Files.readString(Path.of("snippet2.md"));
        assertEquals(List.of("a.com", "a.com(())", "example.com"), MarkdownParse.getLinks(contents));
    }
    @Test
    public void testSnippet3() throws IOException{
        String contents = Files.readString(Path.of("snippet3.md"));
        assertEquals(List.of("https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule",
         "https://cse.ucsd.edu/"), MarkdownParse.getLinks(contents));
    }
}