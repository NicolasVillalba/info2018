package com.info2018.entrenamiento;

import static org.junit.Assert.*;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.eclipse.jgit.api.Git;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JGitCloneRepoTests {

    private static Git api;

    @BeforeClass
    public static void cloneRepo() throws GitAPIException {
        //cloning the repo
        api = Git.cloneRepository()
                .setURI("https://github.com/yogonza524/info2018.git")
                //folder where the repo will be cloned that also is ignored by the CVS in place
                .setDirectory(new File("test"))
                .call(); //throws GitAPIException

    }

    @Test
    public void verifyClonedRepo() throws GitAPIException {
        //Git git = new Git(this.api.getRepository());
       /*
       *
       * "working directory clean" means all the files in the current directory are being
       * managed by git (or are being intentionally ignored via .gitignore) and the most
       * recent version of the file has been committed. If git status mentions
       * "Untracked files:", you may need to add one or more untracked files.
       *
       * */
       assertTrue(this.api.status().call().isClean());
    }

    @Test
    public void checkoutMasterBranch() throws GitAPIException {
        //asserting if the status command contains the given string
        Assert.assertThat(
                this.api.checkout().setName("master").call().getName(),
                CoreMatchers.containsString("master")
        );
    }

    @Test
    @Ignore
    public void showBranchCommandMaster() {

    }

    @AfterClass
    public static void cleanUp() throws IOException {
        //erase de content of the folder
        FileUtils.cleanDirectory(new File("test"));
    }
}
