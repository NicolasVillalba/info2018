package com.info2018.entrenamiento;

import static org.junit.Assert.*;

import org.eclipse.jgit.api.ListBranchCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Ref;
import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.test.context.junit4.SpringRunner;
import org.eclipse.jgit.api.Git;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JGitCloneRepoTests {

    private Git repo;

    @Before
    public void setUp(){

    }

    @Test
    public void cloneRepo() throws GitAPIException {
        //cloning the repo
        this.repo = Git.cloneRepository()
                .setURI("https://github.com/yogonza524/info2018.git")
                //folder where the repo will be cloned that also is ignored by the CVS in place
                .setDirectory(new File("~/IdeaProjects/info2018/.test"))
                .call(); //throws GitAPIException

        //asserting if the status command contains the given string  this.repo.status().call().isClean()
       Assert.assertThat(
                this.repo.checkout().setName("master").call().getName(),
                CoreMatchers.containsString("master")
        );

       /*
       *
       * "working directory clean" means all the files in the current directory are being
       * managed by git (or are being intentionally ignored via .gitignore) and the most
       * recent version of the file has been committed. If git status mentions
       * "Untracked files:", you may need to add one or more untracked files.
       *
       * */

       assertTrue(this.repo.status().call().isClean());

       /*List<Ref> listRefsBranches = this.repo.branchList().setListMode(ListBranchCommand.ListMode.ALL).call();
       for (Ref refBranch : listRefsBranches) {
           System.out.println("Branch : " + refBranch.getName());
       }*/
       //assertEquals(listRefsBranches.contains(), true);
    }

    @After
    public void cleanUp() throws IOException {
        this.repo = null;
        //erase de content of the folder
        FileUtils.cleanDirectory(new File("~/IdeaProjects/info2018/.test"));
    }
}
