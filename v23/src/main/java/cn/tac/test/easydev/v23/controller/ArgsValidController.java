package cn.tac.test.easydev.v23.controller;

import cn.tac.framework.easydev.web.response.wrapper.annotation.GenericResponse;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author tac
 * @since 2018/6/5
 */
@RestController
@RequestMapping("args-valid")
public class ArgsValidController {
    @PostMapping("index")
    @GenericResponse("success")
    public String index(@Valid @RequestBody ArgsValidTestModel model, Errors errors) {
        return "pass";
    }

    public static class ArgsValidTestModel {
        @NotNull
        private String field1;
        @NotBlank
        private String field2;

        public String getField1() {
            return field1;
        }

        public void setField1(String field1) {
            this.field1 = field1;
        }

        public String getField2() {
            return field2;
        }

        public void setField2(String field2) {
            this.field2 = field2;
        }
    }
}
