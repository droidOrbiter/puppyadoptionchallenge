package com.droidorbiter.puppyadoptionchallenge.domain

import com.example.puppyadoptionchallenge.R

class PuppiesImp: Puppies {

    private val puppiesList = arrayListOf<Puppy>()

    data class Puppy(
        var id: String,
        var name: String,
        var breed: String,
        var gender: String,
        var profile_image: Int,
        var image_list: List<Int>,
        var previewDescription: String,
        var description: String
    )

    override fun getPuppiesList(): List<Puppy> = puppiesList

    override fun getPuppyByID(id: String): Puppy {
        return puppiesList.find { it.id == id } ?: puppiesList.first()
    }


    init {
        puppiesList.add(
            Puppy(
            id = "0",
            name = "Lucy",
            breed = "Terrier",
            gender = "Female",
            profile_image = R.drawable.terrier_4,
            image_list = listOf(
                R.drawable.terrier_1, R.drawable.terrier_4,
                R.drawable.terrier_2, R.drawable.terrier_5, R.drawable.terrier_6),
            previewDescription = "Feisty and energetic are two of the primary traits that come to mind for those who have experience with Terriers. In fact, many describe their distinct personalities as “eager for a spirited argument.”",
            description = "Feisty and energetic are two of the primary traits that come to mind for those who have experience with Terriers. In fact, many describe their distinct personalities as “eager for a spirited argument.” Bred to hunt, kill vermin and to guard their families home or barn; sizes range from fairly small, as in the Norfolk, Cairn or West Highland White Terrier, to the larger and grand Airedale Terrier. Prospective owners should know that terriers make great pets, but they do require determination on the part of the owner because they can be stubborn; have high energy levels, and require special grooming (known as “stripping”) to maintain a characteristic appearance."
        ))
        puppiesList.add(
            Puppy(
            id = "1",
            name = "Snowy",
            breed = "Maltese",
            gender = "Male",
            profile_image = R.drawable.maltese_1,
            image_list = listOf(
                R.drawable.maltese_1, R.drawable.maltese_2,
                R.drawable.maltese_3, R.drawable.maltese_4, R.drawable.maltese_5),
            previewDescription = "Throughout his long history, the Maltese has been given many names, such as the \"Melitae Dog,\" \"Ye Ancient Dogge of Malta,\" the \"Roman Ladies Dog,\" \"The Comforter,\" the \"Bichon,\" and the \"Maltese Terrier.\" Today, he is known simply as the Maltese.",
            description = "The Maltese dog is one of the most ancient of the toy breeds, with a history that can be traced back at least two millennia. Artists, poets, and writers immortalized this small dog in the early great cultures of Greece, Rome, and Egypt. They even were mentioned by Aristotle. The Greeks erected tombs for their Maltese dogs, while representations of Maltese-like dogs on Egyptian artifacts suggest that they were prized by that ancient culture. The Egyptians and, centuries later, many Europeans, thought that the Maltese had the ability to cure people of disease and would place one on the pillow of an ill person. This inspired one of its names — \"The Comforter.\" Even before the Christian Era, the breed was widespread in Mediterranean cultures.\n"
        ))
        puppiesList.add(
            Puppy(
            id = "2",
            name = "Sugar",
            breed = "Labrador",
            gender = "Female",
            profile_image = R.drawable.labrador_1,
            image_list = listOf(
                R.drawable.labrador_1, R.drawable.labrador_2,
                R.drawable.labrador_3, R.drawable.labrador_5),
            previewDescription = "The warm and intelligent Labrador Retriever is America's number one breed registered with the American Kennel Club. Even non-dog people can recognize a Lab, and artists and photographers have captured their image countless times--usually as the loyal companion, waiting patiently by their owner's side.",
            description = "Built for sport, the Lab is muscular and athletic. They have a short, easy-care coat, friendly demeanor, keen intelligence, and plenty of energy. Devotion to this breed runs deep; Labs are loving, people-oriented dogs who live to serve their families, and owners and fans sometimes liken their Labs to angels."
        ))
        puppiesList.add(
            Puppy(
            id = "3",
            name = "Winston",
            breed = "Beagle",
            gender = "Male",
            profile_image = R.drawable.beagle_1,
            image_list = listOf(R.drawable.beagle_2, R.drawable.beagle_4, R.drawable.beagle_5),
            previewDescription = "It's difficult to resist the appeal of a Beagle's dark brown or hazel eyes, with his soft, pleading expression. They're happy, outgoing and loving — characteristics more than balanced out by their hound nature, which is inquisitive, determined, and focused on food.",
            description = "The most important thing to know about the Beagle is that he is a scenthound. His nose is the most important part of his anatomy and his head is always down to the ground, searching for an interesting trail to follow. Beagles have approximately 220 million scent receptors compared to the paltry 5 million or so in people, which makes them very good at picking up scents. Humorist Dave Barry once described his in-laws' Beagle as \"a nose with feet.\""
        ))
    }

}