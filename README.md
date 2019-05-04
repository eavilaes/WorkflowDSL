# Workflow DSL
This is a project developed in the 'Design and Modeling of Software Systems'. In this project we had to develop a DSL using the Eclipse-based MDE tools reviewed in the subject.
The statement of the project can be found in a PDF file, called DMSS1819Project.pdf, which contains all the requirements and specifications for the project.


## TO-DO list
0. Add name attribute to Information
1. OCL: There must be one and only one Begin and End tasks in a workflow.
2. OCL: "Send and Receive" must belong to different users.
3. OCL: The ID of each task must be unique in the whole workflow.
4. OCL: The "linked to" link must be to a tag of the same actor.
5. OCL: Information.TypeOfData = FILL FORM can have only Data, SELECT OPTIONS can have only Option, and UPLOAD FILES can have only File.
6. OCL: The ID of the option in a SELECT_OPTIONS must be unique.
7. OCL: The ID of the data in a FILL_FORM must be unique.
8. OCL: The ID of the file in a UPLOAD_FILES must be unique.
9. Add a new TypeOfData: result (for the calculations and things like that).
10. Add a new TypeOfData: file (for the print document Service Task).
11. Remove LinkedFrom and LinkedTo from Begin, End and Message Tasks.

## Check list

## Known bugs
- None (yet)  