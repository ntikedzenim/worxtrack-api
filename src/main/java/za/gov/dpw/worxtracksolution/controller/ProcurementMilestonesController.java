package za.gov.dpw.worxtracksolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.gov.dpw.worxtracksolution.entity.*;
import za.gov.dpw.worxtracksolution.service.*;

import java.util.List;

@RestController
@RequestMapping("/procurement")
@CrossOrigin
public class ProcurementMilestonesController {

    @Autowired
    private SCMPractitionerService scmPractitionerService;

    @PostMapping("/addSCMPractitioner")
    private SCMPractitioner addSCMPractitioner(@RequestBody SCMPractitioner scmPractitioner){
        return scmPractitionerService.saveSCMPractitioner(scmPractitioner);
    }

    @GetMapping("/scmPractitioners/{ptsRef}")
    public ResponseEntity<List<SCMPractitioner>> getAllSCMPractitionerByPtsRef(@PathVariable String ptsRef) {
        List<SCMPractitioner> scmPractitioners = scmPractitionerService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(scmPractitioners);
    }

    @Autowired
    private BSCFormationService bscFormationService;

    @PostMapping("/addBSCFormation")
    private BSCFormation addBSCFormation(@RequestBody BSCFormation bscFormation){
        return bscFormationService.saveBSCFormation(bscFormation);
    }

    @GetMapping("/bscFormations/{ptsRef}")
    public ResponseEntity<List<BSCFormation>> getAllBSCFormationByPtsRef(@PathVariable String ptsRef) {
        List<BSCFormation> bscFormations = bscFormationService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(bscFormations);
    }

    @Autowired
    private BSCMeetingService bscMeetingService;

    @PostMapping("/addBSCMeeting")
    private BSCMeeting addBSCMeeting(@RequestBody BSCMeeting bscMeeting){
        return bscMeetingService.saveBSCMeeting(bscMeeting);
    }

    @GetMapping("/bscMeetings/{ptsRef}")
    public ResponseEntity<List<BSCMeeting>> getAllBSCMeetingByPtsRef(@PathVariable String ptsRef) {
        List<BSCMeeting> bscMeetings = bscMeetingService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(bscMeetings);
    }

    @Autowired
    private ToREndorsedService toREndorsedService;

    @PostMapping("/addToREndorsed")
    private ToREndorsed addToREndorsed(@RequestBody ToREndorsed toREndorsed){
        return toREndorsedService.saveToREndorsed(toREndorsed);
    }

    @GetMapping("/toREndorseds/{ptsRef}")
    public ResponseEntity<List<ToREndorsed>> getAllToREndorsedByPtsRef(@PathVariable String ptsRef) {
        List<ToREndorsed> toREndorseds = toREndorsedService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(toREndorseds);
    }

    @Autowired
    private ProcurementStrategyService procurementStrategyService;

    @PostMapping("/addProcurementStrategy")
    private ProcurementStrategy addProcurementStrategy(@RequestBody ProcurementStrategy procurementStrategy){
        return procurementStrategyService.saveProcurementStrategy(procurementStrategy);
    }

    @GetMapping("/procurementStrategies/{ptsRef}")
    public ResponseEntity<List<ProcurementStrategy>> getAllProcurementStrategyByPtsRef(@PathVariable String ptsRef) {
        List<ProcurementStrategy> procurementStrategies = procurementStrategyService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(procurementStrategies);
    }

    @Autowired
    private BudgetConfirmationService budgetConfirmationService;

    @PostMapping("/addBudgetConfirmation")
    private BudgetConfirmation addBudgetConfirmation(@RequestBody BudgetConfirmation budgetConfirmation){
        return budgetConfirmationService.saveBudgetConfirmation(budgetConfirmation);
    }

    @GetMapping("/budgetConfirmations/{ptsRef}")
    public ResponseEntity<List<BudgetConfirmation>> getAllBudgetConfirmationByPtsRef(@PathVariable String ptsRef) {
        List<BudgetConfirmation> budgetConfirmations = budgetConfirmationService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(budgetConfirmations);
    }

    @Autowired
    private SubmittedNBACService submittedNBACService;

    @PostMapping("/addSubmittedNBAC")
    private SubmittedNBAC addSubmittedNBAC(@RequestBody SubmittedNBAC submittedNBAC){
        return submittedNBACService.saveSubmittedNBAC(submittedNBAC);
    }

    @GetMapping("/submittedNBACS/{ptsRef}")
    public ResponseEntity<List<SubmittedNBAC>> getAllSubmittedNBACByPtsRef(@PathVariable String ptsRef) {
        List<SubmittedNBAC> submittedNBACS = submittedNBACService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(submittedNBACS);
    }

    @Autowired
    private FeedbackNBACService feedbackNBACService;

    @PostMapping("/addFeedbackNBAC")
    private FeedbackNBAC addFeedbackNBAC(@RequestBody FeedbackNBAC feedbackNBAC){
        return feedbackNBACService.saveFeedbackNBAC(feedbackNBAC);
    }

    @GetMapping("/feedbackNBACS/{ptsRef}")
    public ResponseEntity<List<FeedbackNBAC>> getAllFeedbackNBACByPtsRef(@PathVariable String ptsRef) {
        List<FeedbackNBAC> feedbackNBACS = feedbackNBACService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(feedbackNBACS);
    }

    @Autowired
    private BSCMeetingCorrectionsService bscMeetingCorrectionsService;

    @PostMapping("/addBSCMeetingCorrections")
    private BSCMeetingCorrections addBSCMeetingCorrections(@RequestBody BSCMeetingCorrections bscMeetingCorrections){
        return bscMeetingCorrectionsService.saveBSCMeetingCorrections(bscMeetingCorrections);
    }

    @GetMapping("/bscMeetingCorrections/{ptsRef}")
    public ResponseEntity<List<BSCMeetingCorrections>> getAllBSCMeetingCorrectionsByPtsRef(@PathVariable String ptsRef) {
        List<BSCMeetingCorrections> bscMeetingCorrections = bscMeetingCorrectionsService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(bscMeetingCorrections);
    }

    @Autowired
    private ReconfirmationOfBudgetService reconfirmationOfBudgetService;

    @PostMapping("/addReconfirmationOfBudget")
    private ReconfirmationOfBudget addReconfirmationOfBudget(@RequestBody ReconfirmationOfBudget reconfirmationOfBudget){
        return reconfirmationOfBudgetService.saveReconfirmationOfBudget(reconfirmationOfBudget);
    }

    @GetMapping("/reconfirmationOfBudgets/{ptsRef}")
    public ResponseEntity<List<ReconfirmationOfBudget>> getAllReconfirmationOfBudgetByPtsRef(@PathVariable String ptsRef) {
        List<ReconfirmationOfBudget> reconfirmationOfBudgets = reconfirmationOfBudgetService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(reconfirmationOfBudgets);
    }

    @Autowired
    private ResubmittedNBACService resubmittedNBACService;

    @PostMapping("/addResubmittedNBAC")
    private ResubmittedNBAC addResubmittedNBAC(@RequestBody ResubmittedNBAC reconfirmationOfBudget){
        return resubmittedNBACService.saveResubmittedNBAC(reconfirmationOfBudget);
    }

    @GetMapping("/resubmittedNBACS/{ptsRef}")
    public ResponseEntity<List<ResubmittedNBAC>> getAllResubmittedNBACByPtsRef(@PathVariable String ptsRef) {
        List<ResubmittedNBAC> resubmittedNBACS = resubmittedNBACService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(resubmittedNBACS);
    }

//    @Autowired
//    private ResubmittedNBACDao resubmittedNBACDao;
//
//    @GetMapping("/getResubmittedNBAC/{ptsRef}")
//    public ResubmittedNBAC getResubmittedNBAC(@PathVariable String ptsRef){
//        return resubmittedNBACService.getResubmittedNBAC(ptsRef);
//    }

    @Autowired
    private ApprovedNBACService approvedNBACService;

    @PostMapping({"/addApprovedNBAC"})
    public ApprovedNBAC addApprovedNBAC(@RequestBody ApprovedNBAC approvedNBAC) {

        return approvedNBACService.saveApprovedNBAC(approvedNBAC);
    }

    @GetMapping("/approvedNBACS/{ptsRef}")
    public ResponseEntity<List<ApprovedNBAC>> getAllApprovedNBACByPtsRef(@PathVariable String ptsRef) {
        List<ApprovedNBAC> approvedNBACS = approvedNBACService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(approvedNBACS);
    }

    @Autowired
    private TenderAdvertisedService tenderAdvertisedService;

    @PostMapping({"/addTenderAdvertised"})
    public TenderAdvertised addTenderAdvertised(@RequestBody TenderAdvertised tenderAdvertised) {

        return tenderAdvertisedService.saveTenderAdvertised(tenderAdvertised);
    }

    @GetMapping("/tenderAdvertiseds/{ptsRef}")
    public ResponseEntity<List<TenderAdvertised>> getAllTenderAdvertisedByPtsRef(@PathVariable String ptsRef) {
        List<TenderAdvertised> tenderAdvertiseds = tenderAdvertisedService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(tenderAdvertiseds);
    }

    @Autowired
    private BriefingSessionService briefingSessionService;

    @PostMapping({"/addBriefingSession"})
    public BriefingSession addBriefingSession(@RequestBody BriefingSession briefingSession) {

        return briefingSessionService.saveBriefingSession(briefingSession);
    }

    @GetMapping("/briefingSessions/{ptsRef}")
    public ResponseEntity<List<BriefingSession>> getAllBriefingSessionByPtsRef(@PathVariable String ptsRef) {
        List<BriefingSession> briefingSessions = briefingSessionService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(briefingSessions);
    }

    @Autowired
    private TenderClosureService tenderClosureService;

    @PostMapping({"/addTenderClosure"})
    public TenderClosure addTenderClosure(@RequestBody TenderClosure tenderClosure) {

        return tenderClosureService.saveTenderClosure(tenderClosure);
    }

    @GetMapping("/tenderClosures/{ptsRef}")
    public ResponseEntity<List<TenderClosure>> getAllTenderClosureByPtsRef(@PathVariable String ptsRef) {
        List<TenderClosure> tenderClosures = tenderClosureService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(tenderClosures);
    }

    @Autowired
    private BECFormationService becFormationService;

    @PostMapping({"/addBECFormation"})
    public BECFormation addBECFormation(@RequestBody BECFormation becFormation) {

        return becFormationService.saveBECFormation(becFormation);
    }

    @GetMapping("/becFormations/{ptsRef}")
    public ResponseEntity<List<BECFormation>> getAllBECFormationByPtsRef(@PathVariable String ptsRef) {
        List<BECFormation> becFormations = becFormationService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(becFormations);
    }

    @Autowired
    private BECMeetingService becMeetingService;

    @PostMapping({"/addBECMeeting"})
    public BECMeeting addBECMeeting(@RequestBody BECMeeting becMeeting) {

        return becMeetingService.saveBECMeeting(becMeeting);
    }

    @GetMapping("/becMeetings/{ptsRef}")
    public ResponseEntity<List<BECMeeting>> getAllBECMeetingByPtsRef(@PathVariable String ptsRef) {
        List<BECMeeting> becMeetings = becMeetingService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(becMeetings);
    }

    @Autowired
    private SubmitRecommendationNBACService submitRecommendationNBACService;

    @PostMapping({"/addSubmitRecommendationNBAC"})
    public SubmitRecommendationNBAC addSubmitRecommendationNBAC(@RequestBody SubmitRecommendationNBAC submitRecommendationNBAC) {

        return submitRecommendationNBACService.saveSubmitRecommendationNBAC(submitRecommendationNBAC);
    }

    @GetMapping("/submitRecommendationNBACS/{ptsRef}")
    public ResponseEntity<List<SubmitRecommendationNBAC>> getAllSubmitRecommendationNBACByPtsRef(@PathVariable String ptsRef) {
        List<SubmitRecommendationNBAC> submitRecommendationNBACS = submitRecommendationNBACService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(submitRecommendationNBACS);
    }

    @Autowired
    private NBACFeedbackRecommendationService nbacFeedbackRecommendationService;

    @PostMapping({"/addNBACFeedbackRecommendation"})
    public NBACFeedbackRecommendation addNBACFeedbackRecommendation(@RequestBody NBACFeedbackRecommendation nbacFeedbackRecommendation) {

        return nbacFeedbackRecommendationService.saveNBACFeedbackRecommendation(nbacFeedbackRecommendation);
    }

    @GetMapping("/nbacFeedbackRecommendations/{ptsRef}")
    public ResponseEntity<List<NBACFeedbackRecommendation>> getAllNBACFeedbackRecommendationByPtsRef(@PathVariable String ptsRef) {
        List<NBACFeedbackRecommendation> nbacFeedbackRecommendations = nbacFeedbackRecommendationService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(nbacFeedbackRecommendations);
    }

    @Autowired
    private BECMeetingCorrectionsService becMeetingCorrectionsService;

    @PostMapping({"/addBECMeetingCorrections"})
    public BECMeetingCorrections addBECMeetingCorrections(@RequestBody BECMeetingCorrections becMeetingCorrections) {

        return becMeetingCorrectionsService.saveBECMeetingCorrections(becMeetingCorrections);
    }

    @GetMapping("/becMeetingCorrections/{ptsRef}")
    public ResponseEntity<List<BECMeetingCorrections>> getAllBECMeetingCorrectionsByPtsRef(@PathVariable String ptsRef) {
        List<BECMeetingCorrections> becMeetingCorrections = becMeetingCorrectionsService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(becMeetingCorrections);
    }

    @Autowired
    private ResubmittedNBAC2Service resubmittedNBAC2Service;

    @PostMapping({"/addResubmittedNBAC2"})
    public ResubmittedNBAC2 addResubmittedNBAC2(@RequestBody ResubmittedNBAC2 resubmittedNBAC2) {

        return resubmittedNBAC2Service.saveResubmittedNBAC2(resubmittedNBAC2);
    }

    @GetMapping("/resubmittedNBAC2s/{ptsRef}")
    public ResponseEntity<List<ResubmittedNBAC2>> getAllResubmittedNBAC2ByPtsRef(@PathVariable String ptsRef) {
        List<ResubmittedNBAC2> resubmittedNBAC2s = resubmittedNBAC2Service.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(resubmittedNBAC2s);
    }

    @Autowired
    private ApprovedNBAC2Service approvedNBAC2Service;

    @PostMapping({"/addApprovedNBAC2"})
    public ApprovedNBAC2 addApprovedNBAC2(@RequestBody ApprovedNBAC2 approvedNBAC2) {

        return approvedNBAC2Service.saveApprovedNBAC2(approvedNBAC2);
    }

    @GetMapping("/approvedNBAC2s/{ptsRef}")
    public ResponseEntity<List<ApprovedNBAC2>> getAllApprovedNBAC2ByPtsRef(@PathVariable String ptsRef) {
        List<ApprovedNBAC2> approvedNBAC2s = approvedNBAC2Service.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(approvedNBAC2s);
    }

    @Autowired
    private LegalServicesService legalServicesService;

    @PostMapping({"/addLegalServices"})
    public LegalServices addLegalServices(@RequestBody LegalServices legalServices) {

        return legalServicesService.saveLegalServices(legalServices);
    }

    @GetMapping("/legalServices/{ptsRef}")
    public ResponseEntity<List<LegalServices>> getAllLegalServicesByPtsRef(@PathVariable String ptsRef) {
        List<LegalServices> legalServices = legalServicesService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(legalServices);
    }

    @Autowired
    private AwardLetterService awardLetterService;

    @PostMapping({"/addAwardLetter"})
    public AwardLetter addAwardLetter(@RequestBody AwardLetter awardLetter) {

        return awardLetterService.saveAward(awardLetter);
    }

    @GetMapping("/awardLetters/{ptsRef}")
    public ResponseEntity<List<AwardLetter>> getAllAwardLetterByPtsRef(@PathVariable String ptsRef) {
        List<AwardLetter> awardLetters = awardLetterService.getAllByPtsRef(ptsRef);
        return ResponseEntity.ok(awardLetters);
    }

    @GetMapping("/getAwardLetter/{ptsRef}")
    public AwardLetter getAwardLetterByPtsRef(@PathVariable String ptsRef) {
        return awardLetterService.getAwardLetterByPtsRef(ptsRef);
    }

    @GetMapping("/getAllAwardLetter")
    public List<AwardLetter> getAllAwardLetter() {
        return awardLetterService.getAllAwardLetter();
    }

}
