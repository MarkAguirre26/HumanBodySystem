package com.mark.humanbody;

import java.util.ArrayList;


public class utils {

    public static int score;
    public static int currentQ = 1;
    public static int currentPoints;
    public static int DoneQuestion;


    public static ArrayList<Question_model> setA = new ArrayList<Question_model>();
    public static ArrayList<Question_model> setB = new ArrayList<Question_model>();

    static {


//set A
        setA.add(new Question_model("All Life begins with a single _____________.", "A) organ", "B) cell", "C) tissue", "D) microbe", "B"));
        setA.add(new Question_model("The control center of a cell is the _____________.", "A) cytoplasm", "B) nucleus", "C) cell membrane", "D) chromosome", "B"));
        setA.add(new Question_model("Skin, ears, and kidneys are examples of _____________.", "A) tissues", "B) organ systems", "C) organs", "D) cells", "C"));
        setA.add(new Question_model("The _____________ system removes waste products from the body.", "A) Integumentary", "B) Digestive", "C) All of these", "D) Excretory", "C"));
        setA.add(new Question_model("A group of similar cells performing the same function is a(n) _____________.", "A) system", "B) organ", "C) tissue", "D) cell", "C"));
        setA.add(new Question_model("The type of joint in your knee is a _____________ joint.", "A) fixed", "B) gliding", "C) hinge", "D) ball & socket", "C"));
        setA.add(new Question_model("The type of joint found in your shoulder is a _____________ joint.", "A) fixed", "B) ball & socket", "C) gliding", "D) hinge", "B"));
        setA.add(new Question_model("One important function of bones is to produce _____________.", "A) ligaments", "B) tendons", "C) blood cells", "D) cartilage", "C"));
        setA.add(new Question_model("Breathing, heart beating, and food digesting are examples of activities using _____________ type of  muscles.", "A) voluntary", "B) cardiac", "C) involuntary", "D) striated", "C"));
        setA.add(new Question_model("Walking, running, and carrying a book involve using _____________ type of muscles.", "A) voluntary", "B) involuntary", "C) cardiac", "D) striated", "A"));
        setA.add(new Question_model("Cardiac muscle tissue can be found in your _____________.", "A) Heart", "B) Brain", "C) Stomach", "D) Liver", "A"));
        setA.add(new Question_model("Skin helps the body maintain a steady _____________ through perspiration and enlarging of blood vessels.", "A) Temperature", "B) Heart beat", "C) Pace", "D) Tan", "A"));
        setA.add(new Question_model("Digestion begins in the _____________.", "A) mouth", "B) small intestine", "C) large intestine", "D) stomach", "A"));
        setA.add(new Question_model("The human heart has _____________ chambers (rooms).", "A) Three", "B) Four", "C) Five", "D) Two", "B"));
        setA.add(new Question_model("The top chambers of the heart are called the _____________.", "A) Septum", "B) Atrium", "C) Aorta", "D) Ventricle", "B"));
        setA.add(new Question_model("The bottom of the heart is called the _____________.", "A) Septum", "B) Atrium", "C) Aorta", "D) Ventricle", "D"));
        setA.add(new Question_model("Arteries, Veins, and capillaries are the _____________ in the circulatory system.", "A) tissues", "B) organs", "C) vessels", "D) cells", "B"));
        setA.add(new Question_model("This blood type is called the universal donor:", "A) Type O", "B) Type AB", "C) Type A", "D) Type B", "A"));
        setA.add(new Question_model("The main organ in the respiratory system is the _____________. ", "A) Lung", "B) Trachea", "C) Diaphragm", "D) Bronchi", "A"));
        setA.add(new Question_model("In which structure is blood filtered within the kidneys?", "A) nephron", "B) ureter", "C) bladder", "D) gland", "A"));
        setA.add(new Question_model("Water, urea, and other wastes are eliminated in a fluid called _____________.", "A) carbon dioxide", "B) perspiration", "C) urine", "D) protein", "C"));
        setA.add(new Question_model("The _____________ makes urea and breaks down old red blood cells.", "A) Pancreas", "B) Liver", "C) Kidneys", "D) Urethra", "C"));
        setA.add(new Question_model("Axon, cell body, and dendrites are parts of a _____________ cell.", "A) Epithelial", "B) Cardiac", "C) Prokaryotic", "D) Nerve", "D"));
        setA.add(new Question_model("A nerve cell is also called a(n) _____________.", "A) cardiac", "B) prokaryotic", "C) neuron", "D) epithelial", "C"));
        setA.add(new Question_model("The central nervous system includes:", "A) Nerves", "B) Brain & Spinal Cord", "C) Brain", "D) Spinal Cord", "B"));

        //set B
       setB.add(new Question_model("The peripheral nervous system includes :", "A) Nerves", "B) Brain & Spinal Cord", "C) Spinal Cord", "D) Brain", "B"));
       setB.add(new Question_model("The part of the brain responsible for thinking and memory is the_____________", "A) Medulla", "B) Cerebellum", "C) Cerebrum", "D) Spinal Cord", "C"));
       setB.add(new Question_model("The part of the brain responsible for involuntary actions such as breathing and heart beat is the _____________", "A) Medulla", "B) Spinal Cord", "C) Cerebellum", "D) Cerebrum", "A"));
       setB.add(new Question_model("The endocrine gland that helps regulate blood glucose levels:", "A) Adrenal", "B) Pancreas", "C) Thyroid", "D) Pituitary", "B"));
       setB.add(new Question_model("The endocrine gland helps control other glands and regulates blood pressure: and water balance", "A) Pituitary", "B) Adrenal", "C) Thyroid", "D) Pancreas", "A"));
       setB.add(new Question_model("The endocrine organ controls changes in a male's body and regulates the production of sperm:", "A) Testes", "B) Thymus", "C) Pituitary", "D) Adrenal", "A"));
       setB.add(new Question_model("The endocrine gland regulates hormones that control metabolism and energy-related reactions:", "A) Adrenal", "B) Pancreas", "C) Pituitary", "D) Thyroid", "D"));
       setB.add(new Question_model("What is the term which describes the time an egg is released from an ovary?", "A) Ovulation", "B) Reproduction", "C) Duplication", "D) Fertilization", "A"));
       setB.add(new Question_model("What is the term which describes the joining together of a sperm and an egg?", "A) Duplication", "B) Reproduction", "C) Ovulation", "D) Fertilization", "D"));
       setB.add(new Question_model("The primary function of the system is to support and protect the body.", "A) Digestive", "B) Skeletal", "C) Respiratory", "D) Muscular", "B"));
       setB.add(new Question_model("The primary function of this system is to be a communication and response system for the body.", "A) Nervous", "B) Excretory", "C) Lymphatic", "D) Endocrine", "A"));
       setB.add(new Question_model("The primary function of this system is to help you fight pathogens (germs).", "A) Lymphatic", "B) Nervous", "C) Excretory", "D) Endocrine", "A"));
       setB.add(new Question_model("The primary function of this system is to break down food into usable form and to remove waste products.", "A) Digestive", "B) Skeletal", "C) Muscular", "D) Respiratory", "A"));
       setB.add(new Question_model("The bone that protects the brain is called the _____________.", "A) patella", "B) cranium", "C) ribs", "D) tibia", "B"));
       setB.add(new Question_model("The bone(s) that protect the lungs are called the _____________.", "A) ribs", "B) tibia", "C) patella", "D) cranium", "A"));
       setB.add(new Question_model("A condition in which bones become weak and break easily is called _____________.", "A) rickets", "B) acne", "C) arthritis", "D) osteoporosis", "D"));
       setB.add(new Question_model("The bone that prove heart is called the _____________.", "A) pelvis", "B) clavicle", "C) sternum", "D) vertebrae", "C"));
       setB.add(new Question_model("The bone(s) that protect the spinal cord:", "A) pelvis", "B) sternum", "C) clavicle", "D) vertebrae", "D"));
       setB.add(new Question_model("The finger-like projections in the small intestine that soak up nutrients:", "A) villi", "B) phlanges", "C) alveoli", "D) clavicle", "A"));
       setB.add(new Question_model("Tiny air sacs at the ends of the bronchi tubes in the lungs:", "A) villi", "B) clavicle", "C) alveoli", "D) phlanges", "C"));
       setB.add(new Question_model("Skin, hair, and nails are part of this system:", "A) Endocrine", "B) Digestive", "C) Lymphatic", "D) Integumentary", "D"));
       setB.add(new Question_model("Tonsils, Spleen, and Lymph are part of this system which collects excess fluids and helps to fight pathogens (germs):", "A) Digestive", "B) Lymphatic", "C) Integumentary", "D) Endocrine", "B"));
       setB.add(new Question_model("The human body system that includes these glands, thyroid, adrenals, and pancreas:", "A) Digestive", "B) Endocrine", "C) Reproductive", "D) Excretory", "B"));
       setB.add(new Question_model("The sex cells are made in the male testes and female ovaries of this system which enables human race to continue on.", "A) Excretory", "B) Digestive", "C) Reproductive", "D) Endocrine", "C"));
       setB.add(new Question_model("These two body systems work together to allow a person to move, talk, and run.", "A) Integumentary & Lymphatic", "B) Skeletal & Muscular", "C) Endocrine & Reproductive", "D) Digestive & Excretory", "B"));


    }


}
